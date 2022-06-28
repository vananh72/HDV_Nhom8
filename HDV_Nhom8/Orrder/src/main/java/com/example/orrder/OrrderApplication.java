package com.example.orrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrrderApplication.class, args);
    }

}
