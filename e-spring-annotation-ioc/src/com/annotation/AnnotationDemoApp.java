package com.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// load the spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScopeApplicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("baseBallCoach", Coach.class);
		Coach alfaCoach = context.getBean("baseBallCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(alfaCoach.getDailyWorkOut());
	
		context.close();
	}

}
