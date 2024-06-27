package br.com.jproject.gprojectback.domain.enums;

import lombok.Getter;

@Getter
public enum StatusAtividade {
    
    ABERTA("Aberta"),
    PENDENTE("Pendente"),
    PAUSADA("Pausada"),
    EM_PROGRESSO("Em Progresso"),
    CONCLUIDA("Concluída"),
    CANCELADA("Cancelada");

    private String descricao;

    StatusAtividade(String descricao) {
        this.descricao = descricao;
    }
}
