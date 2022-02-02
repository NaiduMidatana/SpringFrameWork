package com.mouritech.springdependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.springdependencyinjection.config.ApplicationConfiguration;
import com.mouritech.springdependencyinjection.constdi.ConstructorBasedDi;

public class ConstructorDiTestMain {
	

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext container 
		      = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		ConstructorBasedDi cbie = container.getBean(ConstructorBasedDi.class);
		cbie.areaFormula("area formula  .........");
	}
}

