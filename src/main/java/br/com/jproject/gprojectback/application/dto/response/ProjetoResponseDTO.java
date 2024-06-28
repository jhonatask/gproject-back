package br.com.jproject.gprojectback.application.dto.response;

import br.com.jproject.gprojectback.domain.enums.StatusProjeto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjetoResponseDTO {

    private UUID id;
    private String nome;
    private String descricao;
    private StatusProjeto status;
    private ClienteResponseDTO cliente;
    private Set<AtividadeResponseDTO> atividades = new HashSet<>();
}
