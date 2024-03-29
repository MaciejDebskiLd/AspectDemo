package com.example.aspectDemo;


import com.example.aspectDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AspectDemoApplication implements CommandLineRunner {

    @Autowired
    EmployeeService employeeService;


    public static void main(String[] args) {
        SpringApplication.run(AspectDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------- ASPECT TEST -----------------");
        System.out.println(employeeService.getEmployee().getName());
        employeeService.getEmployee().setName("Bartek");

        System.out.println(employeeService.getEmployee().getName());

//        employeeService.getEmployee().throwException();


    }


}
