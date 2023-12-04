package com.syy.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.syy.manager")
public class ManagerApplication {
    public static void main(String[] args) {
        System.out.println("111");
        SpringApplication.run(ManagerApplication.class, args);
    }

}
