package com.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMyApp {

	public static void main(String[] args) {
		
		// load spring configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//retrieve bean
		
		//call method of bean
		System.out.println(context.getBean("trackCoach", Coach.class).getDailyWorkOut());
		//baseBallCoach uses Constructor Injection to inject MyFortuneService
		System.out.println(context.getBean("trackCoach", Coach.class).getDailyFortune());
		
		//Get Literal Values  
		System.out.println(context.getBean("trackCoach", TrackCoach.class).getEmailAdress());
		System.out.println(context.getBean("trackCoach", TrackCoach.class).getTeam());
		
		System.out.println(context.getBean("baseBallCoach", Coach.class).getDailyWorkOut());
		// baseBallCoach uses Constructor Injection to inject MyFortuneService
		System.out.println(context.getBean("baseBallCoach", Coach.class).getDailyFortune());
		
		
		// close context
		context.close();

	}

}
