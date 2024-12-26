package com.exceptor.exceptor.exception.badrequest;

import com.exceptor.exceptor.exception.ApiException;
import org.springframework.http.HttpStatus;


public class NotFoundException extends ApiException {
    public NotFoundException(String message, String code) {
        super(message, code, HttpStatus.NOT_FOUND);
    }
}
