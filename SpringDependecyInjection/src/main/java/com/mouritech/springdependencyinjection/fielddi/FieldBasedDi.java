package com.mouritech.springdependencyinjection.fielddi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdependencyinjection.service.AreaService;

@Component
public class FieldBasedDi {

	@Autowired
	@Qualifier("CircleArea")
	private AreaService arService;

	public AreaService getArService() {
		return arService;
	}

	public void setArService(AreaService arService) {
		this.arService = arService;
	}

	public void areaFormula(String form) {
		arService.areaFormula(form);
	}
	
	
}
