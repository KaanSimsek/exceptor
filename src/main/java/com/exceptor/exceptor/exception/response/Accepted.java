package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class Accepted extends HttpResponseException {
    public Accepted(String message, String code) {
        super(message, code, HttpStatus.ACCEPTED);
    }
}
