package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class SeeOther extends HttpResponseException {
    public SeeOther(String message, String code) {
        super(message, code, HttpStatus.SEE_OTHER);
    }
}
