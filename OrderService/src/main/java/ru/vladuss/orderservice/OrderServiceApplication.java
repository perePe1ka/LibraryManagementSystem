package ru.vladuss.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
@EnableDiscoveryClient
public class OrderServiceApplication {

    public static void main(String[] args) {
//        System.setProperty("server.port", "8080");
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}
