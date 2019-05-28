package com.bridgeit.spring.setter;

//dependancy injection using setter injection

public class Student 
{
	private String studentName;
    private int studentId;
	private String address;
	
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void studentInfo()
	{
		System.out.println("student name:"+studentName );
		System.out.println("student id:"+studentId);
		System.out.println("student address:"+address);
	}

}
