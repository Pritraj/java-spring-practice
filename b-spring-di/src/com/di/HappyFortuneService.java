package com.di;

public class HappyFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "Today is your Lucky day from Happy Fortune Service!";
	}
}
