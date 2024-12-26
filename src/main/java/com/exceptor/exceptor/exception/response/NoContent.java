package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class NoContent extends HttpResponseException {
    public NoContent(String message, String code) {
        super(message, code, HttpStatus.NO_CONTENT);
    }
}
