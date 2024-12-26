package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class VariantAlsoNegotiates extends HttpResponseException {
    public VariantAlsoNegotiates(String message, String code) {
        super(message, code, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }
}
