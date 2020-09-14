package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired // any injection
	public void anyFortuneService(@Qualifier("sadFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
//	@Autowired // setter injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("::Tennis Coach : Setter");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Run on Tennis Ground for 30 Mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
