package com.example.getmesocialservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice //this annotation allows this class to automatically intercept the resource errors
public class GlobalExceptionHandler {

    /*
    Injected my RestrictedInfoException into the function to call on its getMessage function.

    This error message will be presented whenever a RestrictedInfoException is thrown.
    */
    @ExceptionHandler(RestrictedInfoException.class)
    public ResponseEntity<String> restrictedInfoException(RestrictedInfoException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }


    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> noSuchElementError(){
        return new ResponseEntity<>("No such element found", HttpStatus.NO_CONTENT);
    }

}
