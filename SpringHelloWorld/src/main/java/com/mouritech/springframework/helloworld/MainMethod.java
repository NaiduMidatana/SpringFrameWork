package com.mouritech.springframework.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    
		HelloWorld hw = (HelloWorld) context.getBean("messageService");
	    String quoteForDay = hw.getMessage();
	    System.out.println(quoteForDay);
	    
	  CustomerDetails cd = (CustomerDetails) context.getBean("CustomerService");
	  int id= cd.getCustomerId();
	  String name = cd.getCustomerName();
	  String addr = cd.getCustomerAddress();
	  System.out.println(cd);
	  System.out.println(id);
	  System.out.println(name);
	  System.out.println(addr);
	     

	}

}
