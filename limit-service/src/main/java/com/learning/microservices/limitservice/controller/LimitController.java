package com.learning.microservices.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.microservices.limitservice.config.Configuration;
import com.learning.microservices.limitservice.entity.Limit;

@RestController
public class LimitController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping(path = "/limits")
	public Limit retriveAllLimits()
	{
		return new Limit(configuration.getMinimum(),configuration.getMaximum());
	}
}
