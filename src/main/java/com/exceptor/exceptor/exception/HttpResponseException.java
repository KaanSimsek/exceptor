package com.exceptor.exceptor.exception;

import org.springframework.http.HttpStatus;

public class HttpResponseException extends RuntimeException{
    private final String message;
    private final String code;
    private final HttpStatus status;

    public HttpResponseException(String message, String code, HttpStatus status) {
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

