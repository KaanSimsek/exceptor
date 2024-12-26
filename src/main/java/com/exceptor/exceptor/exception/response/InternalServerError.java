package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class InternalServerError extends HttpResponseException {
    public InternalServerError(String message, String code) {
        super(message, code, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
