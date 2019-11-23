package com.example.aspectDemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAroundAspect {
//    @Around("execution(* com.example.demoAspect.model.Employee.throwException())")
//
//
//    public void employeeAroundExceptionAdvice(ProceedingJoinPoint pjp){
//        System.out.println("\nBefore throwException");
//        try {
//            pjp.proceed();
//        }catch (Throwable throwable){
//            System.out.println(throwable.getMessage());
//        }
//        System.out.println("After throwException");
//
//    }

}
