package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class IAmATeapot extends HttpResponseException {
    public IAmATeapot(String message, String code) {
        super(message, code, HttpStatus.I_AM_A_TEAPOT);
    }
}
