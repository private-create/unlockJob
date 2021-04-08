package com.by.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobApplication {

    public static void main(String[] args) {
        System.out.println("*******************************************");
        System.out.println("*******************************************");
        System.out.println("********************启动*******************");
        SpringApplication.run(JobApplication.class, args);
        System.out.println("*********************启动完成*******************");
        System.out.println("*******************************************");
        System.out.println("*******************************************");

    }

}
