package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class NotModified extends HttpResponseException {
    public NotModified(String message, String code) {
        super(message, code, HttpStatus.NOT_MODIFIED);
    }
}
