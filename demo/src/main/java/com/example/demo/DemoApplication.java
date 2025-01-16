package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Students;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Running...");
	}

	@Bean
	public CommandLineRunner CommandLineRunner(StudentDAO studentDAO){
		return runner ->{
			createStudent(studentDAO);
		};
	}
	public void createStudent(StudentDAO studentDAO){
		System.out.println("Creating Object...");
		Students tempstudent = new Students("konchan","spycio","hackervnn40@gmail.com");

		System.out.println("Saving...");
		studentDAO.save(tempstudent);

		System.out.println("Saves student. Gen id: ");
	}
}
