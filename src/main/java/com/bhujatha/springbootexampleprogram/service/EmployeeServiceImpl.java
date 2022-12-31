package com.bhujatha.springbootexampleprogram.service;

import com.bhujatha.springbootexampleprogram.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    List<Employee> empList = new ArrayList<Employee>();
    @Override
    public void saveEmployee(Employee employee) {
        empList.add(employee);
    }
}
