package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class LoopDetected extends HttpResponseException {
    public LoopDetected(String message, String code) {
        super(message, code, HttpStatus.LOOP_DETECTED);
    }
}
