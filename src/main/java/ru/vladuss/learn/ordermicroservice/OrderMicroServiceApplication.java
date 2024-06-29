package ru.vladuss.learn.ordermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
public class OrderMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderMicroServiceApplication.class, args);
        System.setProperty("server.port", "8082");
    }

}
