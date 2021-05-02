package com.example.Pr13;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Pr13Application {

	@Value("${student.name}")
	private String studentName;
	@Value("${student.last_name}")
	private String studentLastName;
	@Value("${student.group}")
	private String studentGroup;

	public static void main(String[] args) {
		SpringApplication.run(Pr13Application.class, args);
	}

	@PostConstruct
	public void init() {
		System.out.println(studentName);
		System.out.println(studentLastName);
		System.out.println(studentGroup);
	}

}
