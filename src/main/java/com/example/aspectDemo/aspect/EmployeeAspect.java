package com.example.aspectDemo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

@Component
@Aspect
public class EmployeeAspect {

@Before("execution(public String getName())")
public void getNameAdvice(){
    System.out.println("Executing Advice on getName()");
}

    @Before("execution(* com.example.demoAspect.service.*.get*())")
    public void getAllAdvice(){
        System.out.println("Performing Before Aspect");
    }


    }



