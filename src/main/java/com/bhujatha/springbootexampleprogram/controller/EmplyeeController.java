package com.bhujatha.springbootexampleprogram.controller;

import com.bhujatha.springbootexampleprogram.model.Employee;
import com.bhujatha.springbootexampleprogram.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/employees")
public class EmplyeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        if(employee.getEmployeeId() == null || employee.getEmployeeId().isEmpty()){
            employee.setEmployeeId(UUID.randomUUID().toString());
            employeeService.saveEmployee(employee);
        }

    return employee;
    }
}
