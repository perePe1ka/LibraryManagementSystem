package ru.vladuss.orderservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeanCinfiguration {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
