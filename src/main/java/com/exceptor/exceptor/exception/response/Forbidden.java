package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class Forbidden extends HttpResponseException {
    public Forbidden(String message, String code) {
        super(message, code, HttpStatus.FORBIDDEN);
    }
}
