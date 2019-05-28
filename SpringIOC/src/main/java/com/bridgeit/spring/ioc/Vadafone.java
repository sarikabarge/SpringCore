package com.bridgeit.spring.ioc;

public class Vadafone implements Sim {

	@Override
	public void calling()
	{
		System.out.println("calling using vadafone mobile");
	}
	
	@Override
	public void data()
	{
		System.out.println("browsing internet using vadafone sim");
	}
}
