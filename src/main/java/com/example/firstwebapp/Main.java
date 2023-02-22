package com.example.firstwebapp;

import com.example.firstwebapp.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

        // p1 = new Product("Nintendo Switch", 500, "A very nice Nintendo Switch", "243X5CF7D", 5);

    }

}
