package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Let's inspect the beans provided by Spring Boot:");
		SpringApplication.run(DemoApplication.class, args);
	}

}
