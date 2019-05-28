package com.bridgeit.spring.autowirequalifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testmain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		NumberService numService = (NumberService)context.getBean("numberService");
		System.out.println(numService.getNumber());
		System.out.println(numService.getNumber());
		
		AlphabetService alphabetService = (AlphabetService)context.getBean("alphabetService");
		System.out.println(alphabetService.getAlphabet());
		System.out.println(alphabetService.getAlphabet());
	}
}