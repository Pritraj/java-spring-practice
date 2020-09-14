package com.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class CricketCoach implements Coach {
	
	//Field injection - uses java reflection technology
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	@PostConstruct
	public void methodForPostConstruct() {
		System.out.println("PostConstruct");
	}
	
	@PreDestroy
	public void methodForPreDestroy() {
		System.out.println("PreDestroy");
	}

	@Override
	public String getDailyWorkOut() {
		return "Field for 1 Hour Daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
