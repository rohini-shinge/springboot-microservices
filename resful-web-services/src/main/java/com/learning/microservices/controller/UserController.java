package com.learning.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.microservices.entity.User;
import com.learning.microservices.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/getAllUsers")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}

}
