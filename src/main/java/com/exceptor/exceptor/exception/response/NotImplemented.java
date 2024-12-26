package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class NotImplemented extends HttpResponseException {
    public NotImplemented(String message, String code) {
        super(message, code, HttpStatus.NOT_IMPLEMENTED);
    }
}
