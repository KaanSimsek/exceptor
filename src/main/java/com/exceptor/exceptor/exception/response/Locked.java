package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class Locked extends HttpResponseException {
    public Locked(String message, String code) {
        super(message, code, HttpStatus.LOCKED);
    }
}
