package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class NotAcceptable extends HttpResponseException {
    public NotAcceptable(String message, String code) {
        super(message, code, HttpStatus.NOT_ACCEPTABLE);
    }
}
