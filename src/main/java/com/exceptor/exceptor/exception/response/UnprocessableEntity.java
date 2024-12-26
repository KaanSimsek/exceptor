package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class UnprocessableEntity extends HttpResponseException {
    public UnprocessableEntity(String message, String code) {
        super(message, code, HttpStatus.UNPROCESSABLE_ENTITY);
    }
}
