package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class RequestHeaderFieldsTooLarge extends HttpResponseException {
    public RequestHeaderFieldsTooLarge(String message, String code) {
        super(message, code, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }
}
