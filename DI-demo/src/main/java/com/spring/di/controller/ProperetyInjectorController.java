package com.spring.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;

import com.spring.di.services.GreetingService;
import com.spring.di.services.GreetingServiceImpl;
import com.spring.di.services.PropertyGreetingService;
@Controller
public class ProperetyInjectorController {
	@Autowired
	@Qualifier("propertyGreetingService")
	public GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayHello();
	}

}
