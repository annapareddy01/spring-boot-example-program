package com.bhujatha.springbootexampleprogram.controller;

import com.bhujatha.springbootexampleprogram.model.Employee;
import com.bhujatha.springbootexampleprogram.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/employees")
public class EmplyeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){

        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> loadEmployees(){
        return employeeService.loadEmployees();
    }

    @GetMapping("/{email}")
    public Employee getEmployeeById(@PathVariable String email){
        Employee employee = employeeService.getEmployeeById(email);
        return employee;
    }
}
