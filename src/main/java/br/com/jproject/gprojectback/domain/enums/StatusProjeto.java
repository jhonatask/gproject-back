package br.com.jproject.gprojectback.domain.enums;

public enum StatusProjeto {

    ABERTO("Aberto"),
    PENDENTE("Pendente"),
    PAUSADO("Pausado"),
    EM_PROGRESSO("Em Progresso"),
    CONCLUIDO("Concluído"),
    CANCELADO("Cancelado");

    private String descricao;

    StatusProjeto(String descricao) {
    }
}
