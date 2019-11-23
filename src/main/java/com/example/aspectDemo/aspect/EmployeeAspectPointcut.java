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
    @Pointcut("execution(* setName(*))")
    public void pointcutEmployeeSetName() {
    }

    @After("pointcutEmployeeSetName()")
    public void pointcutEmployeeSetName(JoinPoint joinPoint) {
        System.out.println("------- POINTCUT TEST ------------");
        System.out.println("New name is " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("----- POINTCUT TEST END -----------");
    }

}
