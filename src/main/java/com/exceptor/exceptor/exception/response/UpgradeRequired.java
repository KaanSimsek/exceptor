package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class UpgradeRequired extends HttpResponseException {
    public UpgradeRequired(String message, String code) {
        super(message, code, HttpStatus.UPGRADE_REQUIRED);
    }
}
