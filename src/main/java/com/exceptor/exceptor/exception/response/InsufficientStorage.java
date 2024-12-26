package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class InsufficientStorage extends HttpResponseException {
    public InsufficientStorage(String message, String code) {
        super(message, code, HttpStatus.INSUFFICIENT_STORAGE);
    }
}
