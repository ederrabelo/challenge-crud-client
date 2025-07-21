package com.ederrabelo.challenge_crud_client.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}