package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class CheckPoint extends HttpResponseException {
    public CheckPoint(String message, String code) {
        super(message, code, HttpStatus.CHECKPOINT);
    }
}
