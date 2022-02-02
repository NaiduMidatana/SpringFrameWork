package com.mouritech.springdependencyinjection.service;

import org.springframework.stereotype.Service;

@Service("CircleArea")
public class CircleArea implements AreaService{

	public void areaFormula(String form) {
	System.out.println(form + " for circle is pai r square ");
		
	}

}
