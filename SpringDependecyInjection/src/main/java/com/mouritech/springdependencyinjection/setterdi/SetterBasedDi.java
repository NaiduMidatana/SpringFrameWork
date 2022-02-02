package com.mouritech.springdependencyinjection.setterdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdependencyinjection.service.AreaService;

@Component
public class SetterBasedDi {


	private AreaService arService;

	public AreaService getArService() {
		return arService;
	}
	@Autowired
	@Qualifier("SquareArea")
	public void setArService(AreaService arService) {
		this.arService = arService;
	}

	public void areaFormula(String form) {
		arService.areaFormula(form);
	}
	
	
	
}
