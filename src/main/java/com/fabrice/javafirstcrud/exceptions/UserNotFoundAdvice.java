package com.fabrice.javafirstcrud.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice //anotation for creating an advice
public class UserNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class) //run this advice class whenever
    // UserNotFoundException is used
    // .i.e by this , we automatically connect this advice with its
    //expected exception
    @ResponseStatus(HttpStatus.NOT_FOUND) //not found status code
    public Map<String, String> userNotFoundExceptionHandler(UserNotFoundException exception) {
        Map<String, String> errDetails = new HashMap<>(); //creating new map
        errDetails.put("errorMessage", exception.getMessage());
        return errDetails;
    }
}
