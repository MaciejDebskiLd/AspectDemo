package com.example.aspectDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class EmployeeAspectPointcut {
//    @Pointcut("execution(* setName(*))")
//    public void EmployeeSetNamePointcut(){
//    }
//
//    @After("EmployeeSetNamePointcut()")
//    public void EmployeeSetNamePointcut(JoinPoint joinPoint){
//        System.out.println("New name is " + Arrays.toString(joinPoint.getArgs()));
//    }

}
