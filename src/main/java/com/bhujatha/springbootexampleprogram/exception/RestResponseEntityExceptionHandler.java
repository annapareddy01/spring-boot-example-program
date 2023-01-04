package com.bhujatha.springbootexampleprogram.exception;

import com.bhujatha.springbootexampleprogram.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage employeeNotFoundHandler(EmployeeNotFoundException ex){
     ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
     return errorMessage;
    }

    //Handling User defined Generic Exception
    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage genericExceptionHandler(Exception ex){
        ErrorMessage errorMessage = new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
        return errorMessage;
    }
}
