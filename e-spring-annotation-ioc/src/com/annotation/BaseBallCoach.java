package com.annotation;

import org.springframework.stereotype.Component;

@Component()
public class BaseBallCoach implements Coach {
	
	@Override
	public String getDailyWorkOut() {
		return "Spent 30 mins warm up!";
	}
	
	
}
