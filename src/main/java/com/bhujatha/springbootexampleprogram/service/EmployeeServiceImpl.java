package com.bhujatha.springbootexampleprogram.service;

import com.bhujatha.springbootexampleprogram.exception.EmployeeNotFoundException;
import com.bhujatha.springbootexampleprogram.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    List<Employee> empList = new ArrayList<Employee>();
    @Override
    public Employee saveEmployee(Employee employee) {
        if(employee.getEmployeeId() == null || employee.getEmployeeId().isEmpty()) {
            employee.setEmployeeId(UUID.randomUUID().toString());
        }
        empList.add(employee);
        return employee;
    }

    @Override
    public List<Employee> loadEmployees() {
        return empList;
    }

    @Override
    public Employee getEmployeeById(String email) {

        return empList.stream()
                .filter(employee -> employee.getEmailId().equalsIgnoreCase(email))
                .findFirst()
               // .get();
                .orElseThrow(()-> new RuntimeException("Employee Not found with the ID "+email));
    }
}
