package com.example.aspectDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAfterAspect {

    @After("execution(public void com.example.aspectDemo.model..set*(*)) && args(name)")
    public void logStringArguments(String name) {
        System.out.println("During After Advice an argument was passed: " + name);
    }


    @AfterReturning(pointcut = "execution(* getName())", returning = "returnString")
    public void getNameReturningAdvice(String returnString) {
        System.out.println("getNameReturningAdvice executed. Returned String: " + returnString);
    }

    @AfterThrowing("within(com.example.aspectDemo.model.Employee)")
    public void logExceptions(JoinPoint joinPoint) {
        System.out.println("Exception thrown in Employee Method: " + joinPoint.toString());
    }

}
