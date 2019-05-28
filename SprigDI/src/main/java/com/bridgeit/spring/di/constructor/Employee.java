package com.bridgeit.spring.di.constructor;

//DI using constructor injection

public class Employee
{
	String employeeName;
	int id;
	double salary;
	
	public Employee(String employeeName,int id,double salary)
	{
		this.employeeName=employeeName;
		this.id=id;
		this.salary=salary;
	}
	public void employeeDetails()
	{
		System.out.println("employee Name:"+employeeName);
		System.out.println("employee id:"+id);
		System.out.println("monthly salary:"+salary);
	}

}
