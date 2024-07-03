package com.example.testdelete;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@RequestMapping("/greeting")
public class TestDeleteApplication {

//    private final DiscoveryClient discoveryClient;
//
//    @Value("${spring.application.name}")
//    private String appName;
//
//    public TestDeleteApplication(DiscoveryClient discoveryClient) {
//        this.discoveryClient = discoveryClient;
//    }
//
    public static void main(String[] args) {
        SpringApplication.run(TestDeleteApplication.class, args);
    }
//
//    @GetMapping
//    @Override
//    public String greeting() {
//        return String.format("Hello from '%s'!", appName);
//    }
}
