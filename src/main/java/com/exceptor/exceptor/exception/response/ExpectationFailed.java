package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class ExpectationFailed extends HttpResponseException {
    public ExpectationFailed(String message, String code) {
        super(message, code, HttpStatus.EXPECTATION_FAILED);
    }
}
