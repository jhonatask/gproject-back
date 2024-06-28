package br.com.jproject.gprojectback.core.exceptions;

import br.com.jproject.gprojectback.core.exceptions.exception.CpforCnpjAlreadyRegisteredException;
import br.com.jproject.gprojectback.core.exceptions.exception.ProjetoNotFoundException;
import br.com.jproject.gprojectback.core.exceptions.exception.AtividadeNotFoundException;
import br.com.jproject.gprojectback.core.exceptions.exception.ClienteNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ClienteNotFoundException.class)
    public ResponseEntity<String> handleUserNotFoundException(ClienteNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ProjetoNotFoundException.class)
    public ResponseEntity<String> handleDepartmentNotFoundException(ProjetoNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(AtividadeNotFoundException.class)
    public ResponseEntity<String> handleInvalidPasswordException(AtividadeNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
    }

    @ExceptionHandler(CpforCnpjAlreadyRegisteredException.class)
    public ResponseEntity<String> handleCpfAlreadyRegisteredException(CpforCnpjAlreadyRegisteredException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneralException(Exception ex) {
        return new ResponseEntity<>("Algo inesperado aconteceu: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
