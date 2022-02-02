package com.mouritech.springdependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mouritech.springdependencyinjection.config.ApplicationConfiguration;
import com.mouritech.springdependencyinjection.setterdi.SetterBasedDi;

public class SetterDiTestMain {
	
 public static void main(String[] args) {
	 @SuppressWarnings("resource")
		ApplicationContext container 
		      = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		SetterBasedDi sbie = container.getBean(SetterBasedDi.class);
		sbie.areaFormula("area formula .........");
}
}
