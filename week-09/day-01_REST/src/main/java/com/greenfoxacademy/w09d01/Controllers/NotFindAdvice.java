package com.greenfoxacademy.w09d01.Controllers;

import com.greenfoxacademy.w09d01.Models.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class NotFindAdvice {

    @ResponseBody
    @ExceptionHandler(UnsupportedOperationException.class)
    @ResponseStatus(HttpStatus.OK)
    ErrorMessage notFoudHandler(UnsupportedOperationException ex){
        return new ErrorMessage(ex.getMessage());
    }
}

