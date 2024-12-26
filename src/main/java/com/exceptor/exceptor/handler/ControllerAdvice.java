package com.exceptor.exceptor.handler;

import com.exceptor.exceptor.exception.HttpResponseException;

import java.util.HashMap;
import java.util.Map;

public abstract class ControllerAdvice {

    protected Map<String, Object> convert(HttpResponseException exception) {
        Map<String, Object> body = new HashMap<>();
        if(exception.getCode() != null) {
            body.put("code", exception.getCode());
        }
        if (exception.getMessage() != null) {
            body.put("message", exception.getMessage());
        }
        return body;
    }

}
