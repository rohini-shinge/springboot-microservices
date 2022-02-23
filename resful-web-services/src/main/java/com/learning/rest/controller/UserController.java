package com.learning.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.rest.entity.User;
import com.learning.rest.service.UserService;

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
