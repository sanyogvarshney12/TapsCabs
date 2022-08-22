package com.travel.tapscabs.exception;

public class UserDoesNotExistException extends RuntimeException {

    private String logRef;

    public UserDoesNotExistException(String logRef, String msg) {
        super(msg);
        this.logRef = logRef;
    }
}
