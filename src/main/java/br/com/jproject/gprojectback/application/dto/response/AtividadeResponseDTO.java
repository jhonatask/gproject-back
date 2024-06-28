package br.com.jproject.gprojectback.application.dto.response;

import br.com.jproject.gprojectback.domain.enums.StatusAtividade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AtividadeResponseDTO {

    private UUID id;
    private String descricao;
    private StatusAtividade status;
}
