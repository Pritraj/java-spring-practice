package com.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// load the spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScopeApplicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("baseBallCoach", BaseBallCoach.class);
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		Coach newCoach = context.getBean("tennisCoach", TennisCoach.class);
		System.out.println(newCoach.getDailyWorkOut());
		System.out.println(newCoach.getDailyFortune());
		
		context.close();
	}

}
