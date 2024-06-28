package br.com.jproject.gprojectback.domain.mapper;

import br.com.jproject.gprojectback.application.dto.response.AtividadeResponseDTO;
import br.com.jproject.gprojectback.application.dto.resquest.AtividadeRequestDTO;
import br.com.jproject.gprojectback.domain.model.Atividade;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface AtividadeMapperDTO {

    AtividadeResponseDTO atividadeToAtividadeResponseDTO(Atividade entity);
    Atividade atividadeResponseDtoToAtividade(AtividadeResponseDTO entity);
    Atividade atividadeRequestDtoToAtividade(AtividadeRequestDTO entity);
}
