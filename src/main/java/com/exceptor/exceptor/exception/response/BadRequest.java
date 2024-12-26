package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class BadRequest extends HttpResponseException {
    public BadRequest(String message, String code) {
        super(message, code, HttpStatus.BAD_REQUEST);
    }
}
