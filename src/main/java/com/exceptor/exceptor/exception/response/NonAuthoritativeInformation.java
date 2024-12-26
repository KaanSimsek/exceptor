package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class NonAuthoritativeInformation extends HttpResponseException {
    public NonAuthoritativeInformation(String message, String code) {
        super(message, code, HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }
}
