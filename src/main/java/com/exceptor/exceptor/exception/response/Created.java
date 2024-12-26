package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class Created extends HttpResponseException {
    public Created(String message, String code) {
        super(message, code, HttpStatus.CREATED);
    }
}
