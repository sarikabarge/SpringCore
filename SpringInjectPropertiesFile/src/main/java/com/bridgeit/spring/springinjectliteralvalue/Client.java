package com.bridgeit.spring.springinjectliteralvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("bean.xml file loaded");
        Student student=context.getBean("student",Student.class);
        System.out.println(student);
        student.display();
	}

}
