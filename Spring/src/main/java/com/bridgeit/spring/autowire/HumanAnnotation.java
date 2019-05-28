package com.bridgeit.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HumanAnnotation {
	 @Autowired
	 @Qualifier("heartObject")
		private Heart heart;

		public HumanAnnotation() {
			
		}
	    
		public HumanAnnotation(Heart heart) {   //autowired by constructor
			this.heart = heart;
			System.out.println("Human constructor is getting called which has heart");
		}
		
		 // @Autowired
		 // @Qualifier("heartObjectValue")
		public void setHeart(Heart heart) {
			this.heart = heart;
			System.out.println("setter method called");
		}
		
		public void startPumbing()
		{
			if(heart!=null)
			{
			heart.pump();
			System.out.println("No of animal is: "+heart.getNoOfAnimal()+" No of heart is: "+heart.getNoOfHeart());
			}
			else
			{
				System.out.println("Dead");
			}
		}
	}

