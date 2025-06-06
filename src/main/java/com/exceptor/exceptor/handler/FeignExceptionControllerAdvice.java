package com.exceptor.exceptor.handler;

import com.exceptor.exceptor.exception.HttpResponseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class FeignExceptionControllerAdvice extends ControllerAdvice {

    private final ObjectMapper objectMapper;

    public FeignExceptionControllerAdvice(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @ExceptionHandler(FeignException.class)
    public ResponseEntity<?> handleFeignException(FeignException exception) {
        try {
            var httpResponseException = objectMapper.readValue(exception.contentUTF8(), HttpResponseException.class);
            return new ResponseEntity<>(convert(httpResponseException), httpResponseException.getStatus());
        } catch (Throwable e) { // Todo: If can not convert to HttpResponseException then check type of the exception and return response according to it
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
