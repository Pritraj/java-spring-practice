package com.beans.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkOut() {
		return "Spent 30 mins warm up!";
	}
	
	@Override
	public String getDailyFortune() {
		//use MyFortune Service 
		return fortuneService.getFortune();
	}
	
	
}
