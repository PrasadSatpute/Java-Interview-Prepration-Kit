package com.example.exception.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CustomException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;

    public CustomException(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }

}
