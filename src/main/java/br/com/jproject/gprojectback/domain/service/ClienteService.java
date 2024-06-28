package br.com.jproject.gprojectback.domain.service;

import br.com.jproject.gprojectback.application.dto.response.ClienteResponseDTO;
import br.com.jproject.gprojectback.application.dto.resquest.ClienteRequestDTO;
import br.com.jproject.gprojectback.core.exceptions.exception.ClienteNotFoundException;
import br.com.jproject.gprojectback.domain.mapper.ClienteMapperDTO;
import br.com.jproject.gprojectback.domain.model.Cliente;
import br.com.jproject.gprojectback.domain.repositories.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteMapperDTO clienteMapperDTO;

    public ClienteService(ClienteRepository clienteRepository, ClienteMapperDTO clienteMapperDTO) {
        this.clienteRepository = clienteRepository;
        this.clienteMapperDTO = clienteMapperDTO;
    }

    public ClienteResponseDTO createCliente(ClienteRequestDTO clienteRequestDTO){
        Cliente cliente = clienteMapperDTO.clienteRequestDtoToCliente(clienteRequestDTO);
        BuilderCliente(clienteRequestDTO, cliente);
        clienteRepository.save(cliente);
        return clienteMapperDTO.clienteToClienteResponseDTO(cliente);
    }

    public List<ClienteResponseDTO> listarClientes(){
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes.stream().map(clienteMapperDTO::clienteToClienteResponseDTO).toList();
    }

    public ClienteResponseDTO updateCliente(UUID id, ClienteRequestDTO clienteRequestDTO ){
        Cliente cliente = clienteRepository.findById(id).orElseThrow(ClienteNotFoundException::new);
        BuilderCliente(clienteRequestDTO, cliente);
        clienteRepository.save(cliente);
        return clienteMapperDTO.clienteToClienteResponseDTO(cliente);
    }

    public void deleteCliente(UUID id) {
        Cliente cliente = clienteRepository.findById(id).orElseThrow(ClienteNotFoundException::new);
        clienteRepository.delete(cliente);
    }

    private static void BuilderCliente(ClienteRequestDTO clienteRequestDTO, Cliente cliente) {
        cliente.setNome(clienteRequestDTO.nome);
        cliente.setEmail(clienteRequestDTO.email);
        cliente.setCpforcnpj(clienteRequestDTO.cpforcnpj);
        cliente.setTelefone(clienteRequestDTO.telefone);
    }
}
