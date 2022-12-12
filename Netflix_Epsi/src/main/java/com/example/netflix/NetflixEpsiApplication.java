package com.example.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEpsiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixEpsiApplication.class, args);
    }

}
