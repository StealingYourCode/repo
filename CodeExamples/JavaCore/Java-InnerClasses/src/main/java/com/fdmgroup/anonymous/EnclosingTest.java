package com.fdmgroup.anonymous;

import com.fdmgroup.anonymous.EnclosingClass.InstanceClass;
import com.fdmgroup.anonymous.EnclosingClass.StaticInnerClass;

public class EnclosingTest {

	public static void main(String[] args) {
		//static inner class
		StaticInnerClass staticInnerClass = new StaticInnerClass();
		staticInnerClass.myMethod();
		
		//Instance inner class
		EnclosingClass eClass = new EnclosingClass();
		InstanceClass instanceClass = eClass.new InstanceClass();
		instanceClass.myMethod();
	}
}
