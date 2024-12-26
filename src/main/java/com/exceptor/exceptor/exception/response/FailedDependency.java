package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class FailedDependency extends HttpResponseException {
    public FailedDependency(String message, String code) {
        super(message, code, HttpStatus.FAILED_DEPENDENCY);
    }
}
