package com.di;

public class MyApp {

	public static void main(String[] args) {
		// create object
		Coach theCoach = new TrackCoach();
		//use the object
		System.out.println(theCoach.getDailyWorkOut());
	}

}
