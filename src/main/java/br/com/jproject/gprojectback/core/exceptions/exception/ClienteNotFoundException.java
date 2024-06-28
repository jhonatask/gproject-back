package br.com.jproject.gprojectback.core.exceptions.exception;

public class ClienteNotFoundException extends RuntimeException {

    public ClienteNotFoundException(final String message) {
        super(message);
    }

    public ClienteNotFoundException(String message, Throwable cause){
        super(message, cause);
    }

    public ClienteNotFoundException() {

    }
}
