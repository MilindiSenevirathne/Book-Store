package com.example.crud_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CrudBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudBackendApplication.class, args);
    }

}

