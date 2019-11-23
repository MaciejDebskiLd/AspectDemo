package com.example.aspectDemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAroundAspect {
    @Around("execution(* com.example.aspectDemo.model.Employee.getName())")
    public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("Before invoking getName() method");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }
        System.out.println("After invoking getName() method. Return value: " + value);
        return value;
    }


    //    @Around("execution(* com.example.demoAspect.model.Employee.throwException())")


//    public void employeeAroundExceptionAdvice(ProceedingJoinPoint proceedingJoinPoint){
//        System.out.println("Before throwException");
//        try {
//            proceedingJoinPoint.proceed();
//        }catch (Throwable throwable){
//            System.out.println(throwable.getMessage());
//        }
//        System.out.println("After throwException");
//
//    }

}
