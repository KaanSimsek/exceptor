package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class AlreadyReported extends HttpResponseException {
    public AlreadyReported(String message, String code) {
        super(message, code, HttpStatus.ALREADY_REPORTED);
    }
}
