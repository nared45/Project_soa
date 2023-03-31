package com.example.Project_soa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class ProjectSoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSoaApplication.class, args);
	}

}
