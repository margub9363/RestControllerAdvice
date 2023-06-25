package com.example.RestControllerAdvice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.websparrow")
public class RestControllerAdvice {

	public static void main(String[] args) {
		SpringApplication.run(RestControllerAdvice.class, args);
	}

}
