package com.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDempApp {

	public static void main(String[] args) {
		// load the spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScopeApplicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("baseBallCoach", Coach.class);
		
		Coach alfaCoach = context.getBean("baseBallCoach", Coach.class);
		
		// check if they are the same beans
		System.out.println(theCoach == alfaCoach);
		
		// Memory Location
		System.out.println("Memory Location for theCoach : " + theCoach);
		System.out.println("Memory Location for alfaCoach : " + alfaCoach);
		
		context.close();
	}

}
