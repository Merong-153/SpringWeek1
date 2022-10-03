package com.sparta.homework;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class HomeWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeWorkApplication.class, args);
    }

}