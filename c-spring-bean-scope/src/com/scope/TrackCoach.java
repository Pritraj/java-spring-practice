package com.scope;

public class TrackCoach implements Coach {

	
	private String emailAdress;
	private String team;
	
	// Define Dependency
	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TrackCoach:: Setter Injection of fortuneService");
		this.fortuneService = fortuneService;
	}
	

	public String getEmailAdress() {
		System.out.println("TrackCoach:: get email");
		return emailAdress;
	}



	public void setEmailAdress(String emailAdress) {
		System.out.println("TrackCoach:: set email" + emailAdress);
		this.emailAdress = emailAdress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		this.team = team;
	}



	@Override
	public String getDailyWorkOut() {
		return "Run Hard 5 Km";
	}

	@Override
	public String getDailyFortune() {
		return "From Track - Fortune" + fortuneService.getFortune();
	}

}
