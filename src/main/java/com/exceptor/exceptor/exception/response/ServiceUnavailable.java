package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class ServiceUnavailable extends HttpResponseException {
    public ServiceUnavailable(String message, String code) {
        super(message, code, HttpStatus.SERVICE_UNAVAILABLE);
    }
}
