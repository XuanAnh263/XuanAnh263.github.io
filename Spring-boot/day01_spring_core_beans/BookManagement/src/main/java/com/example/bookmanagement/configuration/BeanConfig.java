package com.example.bookmanagement.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper(); //hỗ trợ convert từ model <--> entity

        objectMapper.registerModule(new JavaTimeModule());//  hỗ trợ convert Date
        return objectMapper;

    }
}
