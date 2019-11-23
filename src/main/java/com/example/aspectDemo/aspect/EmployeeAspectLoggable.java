package com.example.aspectDemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspectLoggable {

    @After("@annotation(com.example.aspectDemo.aspect.Loggable)")
    public void adviceAfterLoggable(){
        System.out.println("After loggable");
    }
}
