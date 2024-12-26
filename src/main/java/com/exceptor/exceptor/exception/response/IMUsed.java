package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class IMUsed extends HttpResponseException {
    public IMUsed(String message, String code) {
        super(message, code, HttpStatus.IM_USED);
    }
}
