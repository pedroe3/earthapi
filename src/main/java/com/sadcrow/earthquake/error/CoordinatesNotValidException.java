package com.sadcrow.earthquake.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class CoordinatesNotValidException extends RuntimeException {
    public CoordinatesNotValidException(String message) {
        super(message);
    }
}
