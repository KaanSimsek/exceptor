package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class Ok extends HttpResponseException {
    public Ok(String message, String code) {
        super(message, code, HttpStatus.OK);
    }
}
