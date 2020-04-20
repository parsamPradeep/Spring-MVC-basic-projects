package com.spring.di.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring.di.services.GreetingService;
@Controller
public class ConstrctorInjectorController {

	private GreetingService greetingService;
	
	public ConstrctorInjectorController( @Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService=greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayHello();
	}
}
