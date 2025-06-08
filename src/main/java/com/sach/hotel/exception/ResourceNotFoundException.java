package com.sach.hotel.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String ex) {

        super("Hotel Not Found !!");
    }
    public ResourceNotFoundException() {

        super();
    }
}
