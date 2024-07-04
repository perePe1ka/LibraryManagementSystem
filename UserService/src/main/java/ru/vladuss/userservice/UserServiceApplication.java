package ru.vladuss.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableJpaAuditing
@EnableDiscoveryClient
public class UserServiceApplication {

    public static void main(String[] args) {
//        System.setProperty("server.port", "8082");
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
