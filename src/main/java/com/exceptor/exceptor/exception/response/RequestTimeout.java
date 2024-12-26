package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class RequestTimeout extends HttpResponseException {
    public RequestTimeout(String message, String code) {
        super(message, code, HttpStatus.REQUEST_TIMEOUT);
    }
}
