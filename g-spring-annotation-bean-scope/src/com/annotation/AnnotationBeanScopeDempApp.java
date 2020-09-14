package com.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDempApp {

	public static void main(String[] args) {
		// load spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		// Tennis is singleton scope
		Coach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		Coach theAlphaCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		boolean res = theCoach == theAlphaCoach;
		System.out.println("Pointing to the same object? =>" + res);
		
		System.out.println("Memory Location of theCoach =>" + theCoach);
		System.out.println("Memory Location of theAlphaCoach =>" + theAlphaCoach);
		
		
		// Cricket is prototype scope
		Coach theCCoach = context.getBean("cricketCoach", CricketCoach.class);
		Coach theAlphaCCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		res = theCCoach == theAlphaCCoach;
		System.out.println("Pointing to the same object? =>" + res);
		
		System.out.println("Memory Location of theCCoach =>" + theCoach);
		System.out.println("Memory Location of theAlphaCCoach =>" + theAlphaCoach);
		
		//retrieve bean from spring context

		
		
		context.close();
	}

}
