package com.bridgeit.spring.springinjectliteralvalue;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	@Value("${student.hobby}")
	private String hobby;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}
	
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void display()
	{
		System.out.println(" student name: "+name);
		System.out.println(" student interestedcourse: "+interestedCourse);
		System.out.println(" student hobby: "+hobby);
	}
}
