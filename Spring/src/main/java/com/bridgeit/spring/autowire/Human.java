package com.bridgeit.spring.autowire;

public class Human {

	private Heart heart;

	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method called");
	}
	
	public Human(Heart heart) {
		this.heart = heart;
	}

	public void startPumbing()
	{
		if(heart!=null)
		{
		heart.pump();
		}
		else
		{
			System.out.println("Dead");
		}
	}
}
