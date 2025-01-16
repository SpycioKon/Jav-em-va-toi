package com.example.demo;

import java.util.List;

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
			findAll(studentDAO);
		};
	}
	public void createStudent(StudentDAO studentDAO){
		System.out.println("Creating Object...");
		Students tempstudent = new Students("kon","chan","hacker@Zlcik2r.com");

		System.out.println("Saving...");
		studentDAO.save(tempstudent);
		
		System.out.println("Saved student");

	}
	public void findById(StudentDAO studentDAO){
		
		System.out.println("Saving...");
		Students myStudent = studentDAO.findById(1);
		
		System.out.println("student "+myStudent);
	}

	public void findAll(StudentDAO studentDAO){
		
		System.out.println("Finding...");
		List<Students> myStudent = studentDAO.findAll();
		
		// System.out.println("student "+myStudent);
		for (Students students : myStudent) {
			System.out.println("student "+students);
		}

	}

}
