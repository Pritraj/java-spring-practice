package com.no.xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// load the spring configuration
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach = context.getBean("baseBallCoach", BaseBallCoach.class);
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
