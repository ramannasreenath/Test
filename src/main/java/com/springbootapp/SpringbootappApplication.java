package com.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootappApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		
		//new RestController().getUser();
		
		SpringApplication.run(SpringbootappApplication.class, args);
		
		System.out.println("test");
	}

} 
