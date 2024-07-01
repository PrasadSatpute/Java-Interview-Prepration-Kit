package com.example.demo.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ProductResponseHandler {
    public static ResponseEntity<Object> responseEntityBuilder(String message, HttpStatus httpStatus, Object object)
    {
        Map<String, Object> response = new HashMap<>();
        response.put("message",message);
        response.put("httpStatus",httpStatus);
        response.put("data",object);

        return new ResponseEntity<>(response,httpStatus);
    }
}
