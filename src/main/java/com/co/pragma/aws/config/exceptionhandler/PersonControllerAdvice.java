package com.co.pragma.aws.config.exceptionhandler;

import com.co.pragma.aws.domain.exception.PersonAlreadyExistsException;
import com.co.pragma.aws.domain.exception.PersonNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class PersonControllerAdvice {

    @ExceptionHandler(PersonAlreadyExistsException.class)
    public ResponseEntity<ExceptionResponse> handlePersonAlreadyExistsException(PersonAlreadyExistsException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ExceptionResponse(ex.getMessage(), HttpStatus.CONFLICT.toString(), LocalDateTime.now()));
    }

    @ExceptionHandler(PersonNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handlePersonNotFoundException(PersonNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionResponse(ex.getMessage(), HttpStatus.NOT_FOUND.toString(), LocalDateTime.now()));
    }

}
