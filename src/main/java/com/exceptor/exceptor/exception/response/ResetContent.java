package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class ResetContent extends HttpResponseException {
    public ResetContent(String message, String code) {
        super(message, code, HttpStatus.RESET_CONTENT);
    }
}
