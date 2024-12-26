package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class Conflict extends HttpResponseException {
    public Conflict(String message, String code) {
        super(message, code, HttpStatus.CONFLICT);
    }
}
