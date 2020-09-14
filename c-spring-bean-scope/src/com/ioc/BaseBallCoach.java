package com.ioc;

public class BaseBallCoach implements Coach {
	
	@Override
	public String getDailyWorkOut() {
		return "Spent 30 mins warm up!";
	}
}
