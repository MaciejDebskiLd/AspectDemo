package com.example.aspectDemo.service;

import com.example.aspectDemo.model.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class EmployeeService {

    private Employee employee;

    public EmployeeService() {
    }

    public EmployeeService(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
