package com.mouritech.springframework.helloworld;

import org.springframework.stereotype.Service;

@Service("messageService")
public class HelloWorld {

	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
