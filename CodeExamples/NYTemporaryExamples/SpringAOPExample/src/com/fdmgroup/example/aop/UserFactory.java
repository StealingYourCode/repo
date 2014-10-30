package com.fdmgroup.example.aop;

public class UserFactory {

	public void operate()
	{
		System.out.println("[UserFactory.operate()]");
	}
	
	
	public int operate(int x)
	{
		System.out.println("[UserFactory.operate(int)]");		
		return 1;
	}
	

	public void startup(String x){
		System.out.println("[UserFactory.startup(String)]");
	}
	
	
	public User createUser()
	{
		System.out.println("[UserFactory.createUser()]");
		
		User user = new User();
		user.setName("Manuel");
		user.setMessage("No");
		return user;
	}


}
