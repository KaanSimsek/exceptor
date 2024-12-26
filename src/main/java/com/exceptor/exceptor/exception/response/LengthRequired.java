package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class LengthRequired extends HttpResponseException {
    public LengthRequired(String message, String code) {
        super(message, code, HttpStatus.LENGTH_REQUIRED);
    }
}
