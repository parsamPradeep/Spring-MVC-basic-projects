package com.spring.di.services;

import org.springframework.stereotype.Service;

@Service
public class SetGreetingService implements GreetingService {

	@Override
	public String sayHello() {
		return "Hello from Set-Greeting Service";
	}
	
}
