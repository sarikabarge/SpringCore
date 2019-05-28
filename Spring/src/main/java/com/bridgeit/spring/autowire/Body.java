package com.bridgeit.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("beanAnnotation.xml");
		HumanAnnotation human=context.getBean("humanAnnotation",HumanAnnotation.class);
		human.startPumbing();

	}

}
