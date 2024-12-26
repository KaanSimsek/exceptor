package com.exceptor.exceptor.exception.response;

import com.exceptor.exceptor.exception.HttpResponseException;
import org.springframework.http.HttpStatus;

public class MultipleChoices extends HttpResponseException {
    public MultipleChoices(String message, String code) {
        super(message, code, HttpStatus.MULTIPLE_CHOICES);
    }
}
