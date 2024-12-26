package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class TooManyRequests extends HttpResponseException {
    public TooManyRequests(String message, String code) {
        super(message, code, HttpStatus.TOO_MANY_REQUESTS);
    }
}
