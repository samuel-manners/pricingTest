package com.avios.springtest.exception;


import com.avios.springtest.model.PricingError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class IllegalArgumentHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Object> handleIllegalArgument(IllegalArgumentException e){

        PricingError pricingError = new PricingError(400, e.getMessage());
        return ResponseEntity.status(400).body(pricingError);

    }
}
