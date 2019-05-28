package com.bridgeit.spring.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Exam {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("config loaded..");
		Student student=context.getBean("student",Student.class);
		student.studentInfo();
       
		Student student1=context.getBean("student1",Student.class);
		student1.studentInfo();
		
	}

}
