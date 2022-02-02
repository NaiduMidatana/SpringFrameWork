package com.mouritech.springdependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.springdependencyinjection.config.ApplicationConfiguration;
import com.mouritech.springdependencyinjection.fielddi.FieldBasedDi;

public class FieldDiTestMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext container 
		      = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		FieldBasedDi fbie = container.getBean(FieldBasedDi.class);
		fbie.areaFormula("area formula .........");
	}
}
