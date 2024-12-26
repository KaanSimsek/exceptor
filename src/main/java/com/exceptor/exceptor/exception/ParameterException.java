package com.exceptor.exceptor.exception;

import java.util.List;

public class ParameterException extends Exception {
    private final String id;
    private final String path;
    private final String message;
    private final ParameterErrorCode code;
    private final List<FieldError> fieldErrors;


    public ParameterException(String id, String path, String message, ParameterErrorCode code) {
        super(message);
        this.id = id;
        this.path = path;
        this.message = message;
        this.code = code;
        this.fieldErrors = null;
    }

    public ParameterException(String id, String path, String message, ParameterErrorCode code, List<FieldError> fieldErrors) {
        super(message);
        this.id = id;
        this.path = path;
        this.message = message;
        this.code = code;
        this.fieldErrors = fieldErrors;
    }

    public String getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public ParameterErrorCode getCode() {
        return code;
    }

    public List<FieldError> getFieldErrors() {
        return fieldErrors;
    }
}

