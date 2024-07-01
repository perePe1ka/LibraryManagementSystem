package ru.vladuss.bookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
@EnableEurekaClient
public class BookServiceApplication {

    public static void main(String[] args) {
//        System.setProperty("server.port", "8081");
        SpringApplication.run(BookServiceApplication.class, args);
    }

}
