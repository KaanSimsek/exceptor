package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class TooEarly extends HttpResponseException {
    public TooEarly(String message, String code) {
        super(message, code, HttpStatus.TOO_EARLY);
    }
}
