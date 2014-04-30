package com.fdmgroup.springhello;

public class SpringHelloWorld 
{	
	private String greeting;

	public SpringHelloWorld(String greeting){
		this.greeting = greeting;
	}
	
	public SpringHelloWorld(){ 	}
	
	public String getGreeting() 
	{
		return greeting;
	}

	public void setGreeting(String greeting) 
	{
		this.greeting = greeting;
	}	
}
