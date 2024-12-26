package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class HttpVersionNotSupported extends HttpResponseException {
    public HttpVersionNotSupported(String message, String code) {
        super(message, code, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }
}
