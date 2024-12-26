package com.exceptor.exceptor.handler;

import com.exceptor.exceptor.exception.FieldError;
import com.exceptor.exceptor.exception.ParameterErrorCode;
import com.exceptor.exceptor.exception.ParameterException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@RestControllerAdvice
public class WebParameterExceptionAdvice {

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<?> handleMissingServletRequestParameterException(
            MissingServletRequestParameterException exception,
            HttpServletRequest request
    ) {
        HttpStatus status  = (HttpStatus) exception.getStatusCode();
        ParameterException parameterException = new ParameterException(
                request.getRequestId(),
                request.getRequestURI(),
                exception.getMessage(),
                ParameterErrorCode.Invalid
        );
        Map<String, Object> body = convertParameterExceptionToMap(parameterException);
        return new ResponseEntity<>(body, status);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<?> handleMethodArgumentTypeMismatchException(
            MethodArgumentTypeMismatchException exception,
            HttpServletRequest request
    ) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ParameterException parameterException = new ParameterException(
                request.getRequestId(),
                request.getRequestURI(),
                exception.getMessage(),
                ParameterErrorCode.Invalid
        );
        Map<String, Object> body = convertParameterExceptionToMap(parameterException);
        return new ResponseEntity<>(body, status);
    }

    @ExceptionHandler(MissingRequestHeaderException.class)
    public ResponseEntity<?> handleMissingRequestHeaderException(
            MissingRequestHeaderException exception,
            HttpServletRequest request
    ) {
        HttpStatus status = (HttpStatus) exception.getStatusCode();
        ParameterException parameterException = new ParameterException(
                request.getRequestId(),
                request.getRequestURI(),
                exception.getMessage(),
                ParameterErrorCode.Invalid
        );
        Map<String, Object> body = convertParameterExceptionToMap(parameterException);
        return new ResponseEntity<>(body, status);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<?> handleHttpMessageNotReadableException(
            HttpMessageNotReadableException exception,
            HttpServletRequest request
    ) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ParameterException parameterException = new ParameterException(
                request.getRequestId(),
                request.getRequestURI(),
                exception.getMessage(),
                ParameterErrorCode.Invalid
        );
        Map<String, Object> body = convertParameterExceptionToMap(parameterException);
        return new ResponseEntity<>(body, status);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodArgumentNotValidException(
            MethodArgumentNotValidException exception,
            HttpServletRequest request
    ) {
        HttpStatus status = (HttpStatus) exception.getStatusCode();
        List<FieldError> fieldErrors = exception.getFieldErrors().stream()
                .map(fieldError -> new FieldError(
                        fieldError.getField(),
                        fieldError.getDefaultMessage()
                )).toList();
        ParameterException parameterException = new ParameterException(
                request.getRequestId(),
                request.getRequestURI(),
                exception.getMessage(),
                ParameterErrorCode.Invalid,
                fieldErrors
        );
        Map<String, Object> body = convertParameterExceptionToMap(parameterException);
        return new ResponseEntity<>(body, status);
    }

    private Map<String, Object> convertParameterExceptionToMap(ParameterException exception) {
        Map<String, Object> result = new HashMap<>();
        result.put("id", exception.getId());
        result.put("path", exception.getPath());
        result.put("message", exception.getMessage());
        result.put("code", exception.getCode());
        result.put("fieldErrors", exception.getFieldErrors());

        // Remove entries with null values
        return result.entrySet().stream()
                .filter(entry -> Objects.nonNull(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }


}
