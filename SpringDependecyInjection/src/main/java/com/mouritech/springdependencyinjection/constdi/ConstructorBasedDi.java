package com.mouritech.springdependencyinjection.constdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.mouritech.springdependencyinjection.service.AreaService;

@Component
public class ConstructorBasedDi {

	
	private AreaService arService;

	@Autowired
	public ConstructorBasedDi(@Qualifier("RectangleArea") AreaService aService) {
		super();
		this.arService = aService;
	}

	

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
