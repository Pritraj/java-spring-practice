package com.scope;

public class BaseBallCoach implements Coach {
	
	// Define Dependency
	private FortuneService fortuneService;
	
	// Constructor Dependency
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
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
