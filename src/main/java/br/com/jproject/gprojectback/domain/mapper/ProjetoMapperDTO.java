package br.com.jproject.gprojectback.domain.mapper;

import br.com.jproject.gprojectback.application.dto.response.ProjetoResponseDTO;
import br.com.jproject.gprojectback.application.dto.resquest.ProjetoRequestDTO;
import br.com.jproject.gprojectback.domain.model.Projeto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ProjetoMapperDTO {

    ProjetoResponseDTO projetoToProjetoResponseDTO(Projeto entity);
    Projeto projetoResponseDtoToProjeto(ProjetoResponseDTO entity);
    Projeto projetoRequestDtoToProjeto(ProjetoRequestDTO entity);
}
