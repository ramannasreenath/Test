package com.springbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.springbootapp.dao.User;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/user")
	public User getUser() {
		
		System.out.println("coming here ");
		return new User(1, "Sreenath");
		
	}
}
