package com.example.microservice3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class secondServices
{
    @Autowired
    private LoadBalancerClient loadBalancer;
    @GetMapping("/")
    public void method() {

        ServiceInstance serviceInstance = loadBalancer.choose("daniel-service");
        System.out.println(serviceInstance.getUri());
        //return serviceInstance.getUri().toString();
    }
}