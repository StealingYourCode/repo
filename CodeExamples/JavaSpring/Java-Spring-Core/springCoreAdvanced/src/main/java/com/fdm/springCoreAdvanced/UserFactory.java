package com.fdm.springCoreAdvanced;

public class UserFactory {

	private static int userId = 0;
	
	public static User createUser(){
		userId+=1;
		return new User(userId);
	}
	
	public User getUser(){
		return UserFactory.createUser();
	}
	
}
