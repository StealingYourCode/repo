package com.fdmgroup.Class;

public class ChildClassInPackage extends SourceClass {
	public static void main(String[] args)
	{
		SourceClass sc = new SourceClass();
		
		sc.methodForAll();				//public call from SourceClass
		sc.methodForFriendsAndFamily();	//protected call from SourceClass
		sc.methodForOnlyFriends();		//default call from SourceClass
		//sc.methodForOnlyClass();		//private call from SourceClass which will never work
		sc.methodCallLocal();			//method from in SourceClass can call all methods
	}
}
