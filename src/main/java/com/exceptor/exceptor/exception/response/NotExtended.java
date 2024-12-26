package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class NotExtended extends HttpResponseException {
    public NotExtended(String message, String code) {
        super(message, code, HttpStatus.NOT_EXTENDED);
    }
}
