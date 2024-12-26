package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class PreconditionFailed extends HttpResponseException {
    public PreconditionFailed(String message, String code) {
        super(message, code, HttpStatus.PRECONDITION_FAILED);
    }
}
