package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class BadGateway extends HttpResponseException {
    public BadGateway(String message, String code) {
        super(message, code, HttpStatus.BAD_GATEWAY);
    }
}
