package com.spring.di.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService{

	@Override
	public String sayHello() {
		return "Hello from Property-Greeting Service";
	}

}
