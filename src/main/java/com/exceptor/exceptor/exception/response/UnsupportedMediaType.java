package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class UnsupportedMediaType extends HttpResponseException {
    public UnsupportedMediaType(String message, String code) {
        super(message, code, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }
}
