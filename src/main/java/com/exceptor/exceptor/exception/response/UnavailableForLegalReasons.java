package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class UnavailableForLegalReasons extends HttpResponseException {
    public UnavailableForLegalReasons(String message, String code) {
        super(message, code, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }
}
