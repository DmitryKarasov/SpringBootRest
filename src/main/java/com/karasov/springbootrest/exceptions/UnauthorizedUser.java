package com.karasov.springbootrest.exceptions;

public class UnauthorizedUser extends RuntimeException {

    public UnauthorizedUser(String message) {
        super(message);
    }
}
