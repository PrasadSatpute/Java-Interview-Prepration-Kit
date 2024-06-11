package com.example.exception.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(value = CustomExceptionNameNotFound.class)
    public ResponseEntity<Object> handleNameNotFoundException(CustomExceptionNameNotFound customExceptionNameNotFound)
    {
        CustomException customException = new CustomException(
                customExceptionNameNotFound.getMessage(),
                customExceptionNameNotFound.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(customException,HttpStatus.NOT_FOUND);
    }
}
