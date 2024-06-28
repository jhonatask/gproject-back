package br.com.jproject.gprojectback.core.exceptions.exception;

public class ProjetoNotFoundException extends RuntimeException{

    public ProjetoNotFoundException(String message) {
        super(message);
    }

    public ProjetoNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProjetoNotFoundException() {
    }
}
