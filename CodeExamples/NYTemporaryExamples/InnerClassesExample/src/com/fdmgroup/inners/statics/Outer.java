package com.fdmgroup.inners.statics;

import static com.fdmgroup.inners.statics.Outer.Inner;

public class Outer {

	public static void staticGo(){
		
	}
	
	public void go(){
		
		Inner myInstance = new Inner();
		// Can access private member of static inner
		myInstance.innerGo();
		
	}
	
	public static class Inner {
		
		public int magic_number = 8324;
		
		private void innerGo(){
			// Do something
			staticGo();
		}
	}

}


class SomeOtherClass {
	
	void someOtherMethod(){

		// Without regular import, in another package
//		com.fdmgroup.inners.statics.Outer.Inner instance = 
//				new com.fdmgroup.inners.statics.Outer.Inner();
//		
		// Creating an instance outside of the outer class
		// without static import

		Outer.Inner myInstance = new Outer.Inner(); 
	
		
		// Instance Inner creation
		//Outer.Inner myInstance = new Outer().new Inner();
		
		// Creating an instance outside of the outer class
		// with static import -- can use name of inner class directly!
		//
		Inner myOtherInstance = new Inner();
	}
	
	public static void main(String[] args){

		int x = 5 * 4 % 3;
		System.out.println(x);   

	}
}







