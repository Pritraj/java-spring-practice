package com.di;

public class TrackCoach implements Coach {

	// Define Dependency
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Run Hard 5 Km";
	}

	@Override
	public String getDailyFortune() {
		return "From Track - Fortune" + fortuneService.getFortune();
	}

}
