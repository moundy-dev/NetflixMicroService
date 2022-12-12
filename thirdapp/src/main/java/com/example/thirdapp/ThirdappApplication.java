package com.example.thirdapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class ThirdappApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdappApplication.class, args);
    }

}
