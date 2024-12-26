package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class ProxyAuthenticationRequired extends HttpResponseException {
    public ProxyAuthenticationRequired(String message, String code) {
        super(message, code, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }
}
