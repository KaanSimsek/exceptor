package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class PayloadTooLarge extends HttpResponseException {
    public PayloadTooLarge(String message, String code) {
        super(message, code, HttpStatus.PAYLOAD_TOO_LARGE);
    }
}
