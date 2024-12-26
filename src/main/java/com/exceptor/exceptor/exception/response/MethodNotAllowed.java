package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class MethodNotAllowed extends HttpResponseException {
    public MethodNotAllowed(String message, String code) {
        super(message, code, HttpStatus.METHOD_NOT_ALLOWED);
    }
}
