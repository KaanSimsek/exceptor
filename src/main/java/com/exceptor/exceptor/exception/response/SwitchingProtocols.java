package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;



public class SwitchingProtocols extends HttpResponseException {
    public SwitchingProtocols(String message, String code) {
        super(message, code, HttpStatus.SWITCHING_PROTOCOLS);
    }
}

