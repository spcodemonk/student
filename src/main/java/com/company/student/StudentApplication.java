package com.company.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/student");
		SpringApplication.run(StudentApplication.class, args);
		
		System.out.println("Hi Sharad");
		
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	
}