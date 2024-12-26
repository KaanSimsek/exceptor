package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class MultiStatus extends HttpResponseException {
    public MultiStatus(String message, String code) {
        super(message, code, HttpStatus.MULTI_STATUS);
    }
}
