package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class TemporaryRedirect extends HttpResponseException {
    public TemporaryRedirect(String message, String code) {
        super(message, code, HttpStatus.TEMPORARY_REDIRECT);
    }
}
