package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Running...");
	}

	@Bean
	public CommandLineRunner CommandLineRunner(String[] args){
		return runner ->{
			System.out.println("Hello world");
		};
	}
}
