package com.fdmgroup.OutsideofClass;

import com.fdmgroup.Class.SourceClass;

public class ChildClassOutOfPackage extends SourceClass {
		
	public static void main(String[] args)
	{
		SourceClass sc = new SourceClass();
		ChildClassOutOfPackage x= new ChildClassOutOfPackage();
		
		sc.methodForAll();				//public call from SourceClass
		x.methodForFriendsAndFamily();	//protected call from SourceClass via ChildClassOutOfPackage
		//sc.methodForOnlyFriends();	//protected call from SourceClass which will never work
		//sc.methodForOnlyClass();		//private call from SourceClass which will never work
		sc.methodCallLocal();			//method from in SourceClass can call all methods
	}
}
