package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class NetworkAuthenticationRequired extends HttpResponseException {
    public NetworkAuthenticationRequired(String message, String code) {
        super(message, code, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }
}
