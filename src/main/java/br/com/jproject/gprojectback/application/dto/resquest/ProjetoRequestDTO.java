package br.com.jproject.gprojectback.application.dto.resquest;

import br.com.jproject.gprojectback.domain.enums.StatusProjeto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjetoRequestDTO {

    private String nome;
    private String descricao;
    private StatusProjeto status;
    private ClienteRequestDTO cliente;

}
