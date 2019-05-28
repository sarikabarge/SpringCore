package com.bridgeit.spring.diinterface;

public class MobileShop {
	
	private Mobile mobile;
	
	public MobileShop() {}

	
	public MobileShop(Mobile mobile) {
		super();
		this.mobile = mobile;
	}


	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	public void test()
	{
		mobile.getMobile();
		mobile.getPrice();
		System.out.println("this is test method ");
	}
	

}
