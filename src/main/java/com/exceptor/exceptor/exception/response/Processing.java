package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class Processing extends HttpResponseException {
    public Processing(String message, String code) {
        super(message, code, HttpStatus.PROCESSING);
    }
}
