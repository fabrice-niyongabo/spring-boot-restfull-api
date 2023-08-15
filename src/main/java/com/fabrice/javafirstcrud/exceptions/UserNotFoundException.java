package com.fabrice.javafirstcrud.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(long id) {
        super("Could not find user with ID of " + id);
    }
}
