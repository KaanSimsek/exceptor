package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class MovedPermanently extends HttpResponseException {
    public MovedPermanently(String message, String code) {
        super(message, code, HttpStatus.MOVED_PERMANENTLY);
    }
}
