package com.mouritech.springdependencyinjection.service;

import org.springframework.stereotype.Service;

@Service("SquareArea")
public class SquareArea implements AreaService {

	public void areaFormula(String form) {
		// TODO Auto-generated method stub
		System.out.println(form + "for Square is s * s");
	}

}
