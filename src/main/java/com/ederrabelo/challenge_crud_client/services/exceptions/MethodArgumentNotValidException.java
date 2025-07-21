package com.ederrabelo.challenge_crud_client.services.exceptions;

public class MethodArgumentNotValidException extends RuntimeException {
    public MethodArgumentNotValidException(String msg) {
        super(msg);
    }
}
