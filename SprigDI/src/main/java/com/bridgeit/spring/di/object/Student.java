package com.bridgeit.spring.di.object;

public class Student 
{
	 private  int id;
	 private MathCheat math;
	  
	  public void setId(int id)
	  {
		  this.id=id;
	  }
	  
  public void setMath(MathCheat math) 
    {
		this.math = math;
	}
  

	public void cheating()
	{
		math.mathCheat();
		System.out.println("id is:"+id);
	}

}
