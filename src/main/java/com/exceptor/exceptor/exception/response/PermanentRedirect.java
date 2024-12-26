package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class PermanentRedirect extends HttpResponseException {
    public PermanentRedirect(String message, String code) {
        super(message, code, HttpStatus.PERMANENT_REDIRECT);
    }
}
