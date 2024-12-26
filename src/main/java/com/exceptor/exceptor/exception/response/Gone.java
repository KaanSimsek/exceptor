package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class Gone extends HttpResponseException {
    public Gone(String message, String code) {
        super(message, code, HttpStatus.GONE);
    }
}
