package com.example.exception.exception;

public class CustomExceptionNameNotFound extends RuntimeException{
    public CustomExceptionNameNotFound(String message) {
        super(message);
    }

    public CustomExceptionNameNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
