package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class Continue extends HttpResponseException {
    public Continue(String message, String code) {
        super(message, code, HttpStatus.CONTINUE);
    }
}
