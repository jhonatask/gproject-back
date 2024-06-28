package br.com.jproject.gprojectback.domain.mapper;

import br.com.jproject.gprojectback.application.dto.response.ClienteResponseDTO;
import br.com.jproject.gprojectback.application.dto.resquest.ClienteRequestDTO;
import br.com.jproject.gprojectback.domain.model.Cliente;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ClienteMapperDTO {

    ClienteResponseDTO clienteToClienteResponseDTO(Cliente entity);
    Cliente clienteResponseDtoToCliente(ClienteResponseDTO entity);
    Cliente clienteRequestDtoToCliente(ClienteRequestDTO entity);
}
