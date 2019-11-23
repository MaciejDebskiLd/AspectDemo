package com.example.aspectDemo.service;

import com.example.aspectDemo.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private Employee employee;

    public EmployeeService(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }


}
