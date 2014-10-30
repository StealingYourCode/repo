package com.fdmgroup.example.aop;

public class UserFactory {

	public void operate()
	{
		System.out.println("[User.operate()]");
	}
	
	
	public int operate(int x)
	{
		System.out.println("[User.operate(int)]");		
		return 1;
	}
	

	public void startup(String x){
		System.out.println("[User.startup(String)]");
	}
	
	
	public User createUser()
	{
		System.out.println("[User.createUser()]");
		return new User();
	}


}
