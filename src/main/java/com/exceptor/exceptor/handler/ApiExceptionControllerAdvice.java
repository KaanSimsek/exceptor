package com.exceptor.exceptor.handler;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionControllerAdvice {

    @ExceptionHandler(HttpResponseException.class)
    public ResponseEntity<?> handleApiException(HttpResponseException exception) {
        return new ResponseEntity<>(exception.getMessage(), exception.getStatus());
    }
}
