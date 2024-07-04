package com.fastcampus.boardserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Boardserver3Application {

    public static void main(String[] args) {
        SpringApplication.run(Boardserver3Application.class, args);
    }

}
