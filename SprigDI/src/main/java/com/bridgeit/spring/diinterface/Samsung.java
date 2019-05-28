package com.bridgeit.spring.diinterface;

public class Samsung implements Mobile{

	@Override
	public void getMobile() {
	
		System.out.println("Samsung j7 ");
		
	}

	@Override
	public void getPrice() {
	
		System.out.println("12000");
		
	}
	
	

}
