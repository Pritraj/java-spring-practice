package com.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMyApp {

	public static void main(String[] args) {
		
		// load spring configuration
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//retrieve bean
		
		//call method of bean
		System.out.println(context.getBean("trackCoach", Coach.class).getDailyWorkOut());
		System.out.println(context.getBean("baseBallCoach", Coach.class).getDailyWorkOut());
		
		// close context
		context.close();

	}

}
