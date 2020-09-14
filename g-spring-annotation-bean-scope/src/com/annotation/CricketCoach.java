package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {
	
	//Field injection - uses java reflection technology
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkOut() {
		return "Field for 1 Hour Daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
