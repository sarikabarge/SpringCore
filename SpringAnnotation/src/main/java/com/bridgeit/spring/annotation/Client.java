package com.bridgeit.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		//Appl cicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		//System.out.println("bean.xml file loaded");
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
       College college=context.getBean("collegeBeanAnother",College.class);
       System.out.println("the college object created by spring is: "+college);
       college.test();
	}

}
