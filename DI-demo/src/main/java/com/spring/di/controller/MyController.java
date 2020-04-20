package com.spring.di.controller;

import org.springframework.stereotype.Controller;

import com.spring.di.services.GreetingService;

@Controller
public class MyController {

	private GreetingService greetingService;
	
	
	public String hello() {
		return greetingService.sayHello();
	}


	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
