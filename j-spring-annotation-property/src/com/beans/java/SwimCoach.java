package com.beans.java;

public class SwimCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Swim for 20 mins straight.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
