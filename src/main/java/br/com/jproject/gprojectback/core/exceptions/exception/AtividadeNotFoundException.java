package br.com.jproject.gprojectback.core.exceptions.exception;

public class AtividadeNotFoundException extends RuntimeException {
    public AtividadeNotFoundException(final String message) {
        super(message);
    }

    public AtividadeNotFoundException(String message, Throwable cause){
        super(message, cause);
    }

    public AtividadeNotFoundException() {

    }
}
