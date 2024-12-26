package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class PreconditionRequired extends HttpResponseException {
    public PreconditionRequired(String message, String code) {
        super(message, code, HttpStatus.PRECONDITION_REQUIRED);
    }
}
