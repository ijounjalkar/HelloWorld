package com.capg.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld1Application {

	public static void main(String[] args) {
		System.out.println("Hello from Capgemini");
		SpringApplication.run(HelloWorld1Application.class, args);
	}

}
