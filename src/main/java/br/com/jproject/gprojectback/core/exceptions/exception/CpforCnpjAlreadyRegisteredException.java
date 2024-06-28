package br.com.jproject.gprojectback.core.exceptions.exception;

public class CpforCnpjAlreadyRegisteredException extends RuntimeException{
    public CpforCnpjAlreadyRegisteredException(final String message) {
        super(message);
    }

    public CpforCnpjAlreadyRegisteredException(String message, Throwable cause) {
        super(message);
    }

    public CpforCnpjAlreadyRegisteredException() {
    }
}
