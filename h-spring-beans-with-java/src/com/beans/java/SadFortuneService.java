package com.beans.java;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "No Luck today :(";
	}

}
