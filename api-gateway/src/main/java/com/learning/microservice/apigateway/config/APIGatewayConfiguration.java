package com.learning.microservice.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIGatewayConfiguration {
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
	
		return builder.routes().
				route(p->p.path("/currency-exchange/**").uri("lb://currency-exchange")).
				route(p->p.path("/currency-conversion/**").uri("lb://currency-conversion")).
				route(p->p.path("/currency-conversion-feign/**").uri("lb://currency-conversion")).
				build();
	}
}
