package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class Found extends HttpResponseException {
    public Found(String message, String code) {
        super(message, code, HttpStatus.FOUND);
    }
}
