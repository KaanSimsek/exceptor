package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class Unauthorized extends HttpResponseException {
    public Unauthorized(String message, String code) {
        super(message, code, HttpStatus.UNAUTHORIZED);
    }
}
