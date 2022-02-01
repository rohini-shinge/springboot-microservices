package com.learning.microservice.currencyexchange.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learning.microservice.currencyexchange.entity.CurrencyExchange;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from,@PathVariable String to)
	{
		CurrencyExchange currencyExchange= new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(50));
		currencyExchange.setEnvironment(environment.getProperty("local.server.port"));
		return currencyExchange;
	}

}
