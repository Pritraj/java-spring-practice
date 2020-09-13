package com.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMyApp {

	public static void main(String[] args) {
		
		// load spring configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//retrieve bean
		
		//call method of bean
		System.out.println(context.getBean("trackCoach", Coach.class).getDailyWorkOut());
		System.out.println(context.getBean("trackCoach", Coach.class).getDailyFortune());
		
		System.out.println(context.getBean("baseBallCoach", Coach.class).getDailyWorkOut());
		// baseBallCoach uses Constructor Injection to inject MyFortuneService
		System.out.println(context.getBean("baseBallCoach", Coach.class).getDailyFortune());
		
		
		// close context
		context.close();

	}

}
