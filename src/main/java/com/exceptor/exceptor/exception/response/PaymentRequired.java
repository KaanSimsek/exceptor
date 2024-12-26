package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class PaymentRequired extends HttpResponseException {
    public PaymentRequired(String message, String code) {
        super(message, code, HttpStatus.PAYMENT_REQUIRED);
    }
}
