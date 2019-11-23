package com.example.aspectDemo.model;

import com.example.aspectDemo.aspect.Loggable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String name;

    public Employee(@Value("Base name") String name){this.name = name;}

    public Employee() {
    }

    public String getName() {
        return name;
    }
@Loggable
    public void setName(String name) {
        this.name = name;
    }

    public void throwException(){
        throw new RuntimeException("Base name exception");
    }
}
