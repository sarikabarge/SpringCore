package com.bridgeit.spring.autowire;

public class Heart {

	private String noOfAnimal;
	private int noOfHeart;
	
	public String getNoOfAnimal() {
		return noOfAnimal;
	}

	public void setNoOfAnimal(String noOfAnimal) {
		this.noOfAnimal = noOfAnimal;
	}

	public int getNoOfHeart() {
		return noOfHeart;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

	public void pump()
	{
		System.out.println("your heart is pumping");
		
	}
}
