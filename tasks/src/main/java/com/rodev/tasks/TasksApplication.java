package com.rodev.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		System.out.println(System.getenv("POSTGRES_DB"));
		SpringApplication.run(TasksApplication.class, args);
	}

}
