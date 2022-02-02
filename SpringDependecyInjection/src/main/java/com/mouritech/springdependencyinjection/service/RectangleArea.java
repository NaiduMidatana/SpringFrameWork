package com.mouritech.springdependencyinjection.service;

import org.springframework.stereotype.Service;

@Service("RectangleArea")
public class RectangleArea implements AreaService{

	public void areaFormula(String form) {
		// TODO Auto-generated method stub
		System.out.println(form + "for rectangle is length * width");
	}

}
