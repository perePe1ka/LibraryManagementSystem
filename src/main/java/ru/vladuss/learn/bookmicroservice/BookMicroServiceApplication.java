package ru.vladuss.learn.bookmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
public class BookMicroServiceApplication {




    public static void main(String[] args) {
        System.setProperty("server.port", "8081");
        SpringApplication.run(BookMicroServiceApplication.class, args);
    }


}
