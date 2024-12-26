package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class PartialContent extends HttpResponseException {
    public PartialContent(String message, String code) {
        super(message, code, HttpStatus.PARTIAL_CONTENT);
    }
}
