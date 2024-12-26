package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class GatewayTimeout extends HttpResponseException {
    public GatewayTimeout(String message, String code) {
        super(message, code, HttpStatus.GATEWAY_TIMEOUT);
    }
}
