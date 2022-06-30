package com.bridgelabz.springemployeepayroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringEmployeePayrollApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringEmployeePayrollApplication.class, args);
        log.info("employee payroll app started");
    }
}
