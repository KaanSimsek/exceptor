package com.exceptor.exceptor.exception;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class ApiException extends RuntimeException{
    private String message;
    private String code;
    private HttpStatus status;

    public ApiException(String message, String code, HttpStatus status) {
        super(message);
        this.message = message;
        this.code = code;
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }

    public HttpStatus getStatus() {
        return status;
    }
}

