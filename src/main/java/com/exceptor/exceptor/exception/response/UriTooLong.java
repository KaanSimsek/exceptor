package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class UriTooLong extends HttpResponseException {
    public UriTooLong(String message, String code) {
        super(message, code, HttpStatus.URI_TOO_LONG);
    }
}
