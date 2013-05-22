package com.fdmgroup.Class;

public class SourceClass {

	public void methodForAll()
	{
		System.out.println("Call from the public method");
	}

	protected void methodForFriendsAndFamily()
	{
		System.out.println("Call from the protected method");
	}

	void methodForOnlyFriends()
	{
		System.out.println("Call from the <default> method");
	}
	
	private void methodForOnlyClass()
	{
		System.out.println("Call from the private method");
	}

	public void methodCallLocal()
	{
		System.out.println("Call from public method in SourceClass.");
		methodForAll();
		methodForFriendsAndFamily();
		methodForOnlyFriends();
		methodForOnlyClass();
	}
}
