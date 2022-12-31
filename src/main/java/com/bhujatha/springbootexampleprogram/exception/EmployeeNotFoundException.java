package com.bhujatha.springbootexampleprogram.exception;

public class EmployeeNotFoundException extends  RuntimeException{
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
