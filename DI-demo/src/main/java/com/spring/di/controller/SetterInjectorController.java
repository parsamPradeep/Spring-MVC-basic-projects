package com.spring.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring.di.services.GreetingService;
@Controller
public class SetterInjectorController {
	private GreetingService greetingService;
	@Autowired
	public void setSetterInjectorController(@Qualifier("setGreetingService")GreetingService greetingService) {
		this.greetingService=greetingService;
	}

	public String sayHello() {
		return greetingService.sayHello();
	}
}
