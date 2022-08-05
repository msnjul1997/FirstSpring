package com.example.firstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringApplication {

    public static void main(String[] args) {
        System.out.println("Hello! Am From BridgeLabz");
        SpringApplication.run(FirstSpringApplication.class, args);
    }

}
