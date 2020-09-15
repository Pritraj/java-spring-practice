package com.beans.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.beans.java")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	//define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	} 
	
	// define a bean for Swim coach and inject its dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	} 
}
