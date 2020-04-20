package com.spring.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.di.controller.ConstrctorInjectorController;
import com.spring.di.controller.MyController;
import com.spring.di.controller.ProperetyInjectorController;
import com.spring.di.controller.SetterInjectorController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(DiDemoApplication.class, args);
		MyController controller=(MyController) ctx.getBean("myController");
		System.out.println(controller.hello());
		System.out.println(ctx.getBean(ProperetyInjectorController.class).sayHello());
		System.out.println(ctx.getBean(ConstrctorInjectorController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectorController.class).sayHello());
	}

}
