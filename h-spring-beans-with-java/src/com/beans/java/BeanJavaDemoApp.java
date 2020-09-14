package com.beans.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanJavaDemoApp {

	public static void main(String[] args) {
		// load the spring configuration
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach theCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		Coach theAlfaCoach = context.getBean("baseBallCoach", BaseBallCoach.class);
		System.out.println(theAlfaCoach.getDailyWorkOut());
		System.out.println(theAlfaCoach.getDailyFortune());
		
		context.close();
	}

}
