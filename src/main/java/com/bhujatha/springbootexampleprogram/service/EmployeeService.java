package com.bhujatha.springbootexampleprogram.service;

import com.bhujatha.springbootexampleprogram.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    List<Employee> loadEmployees();

    Employee getEmployeeById(String email);

    String deleteEmployeeById(String email);
}
