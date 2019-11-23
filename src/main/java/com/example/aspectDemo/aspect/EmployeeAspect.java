package com.example.aspectDemo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

@Component
@Aspect
public class EmployeeAspect {


//    @Before("execution(* com.example.aspectDemo.service.EmployeeService.*(..))")
//    public void employeeBeforeAspect(){
//        System.out.println("Performing Before Aspect");
//
//    }

    @Before("execution(public String setName())")
    public void employeeBeforeAspect() {
        System.out.println("Performing Before Aspect");

    }
}



