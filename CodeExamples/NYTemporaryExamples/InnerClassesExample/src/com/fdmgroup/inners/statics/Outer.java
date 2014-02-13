package com.fdmgroup.inners.statics;

import static com.fdmgroup.inners.statics.Outer.Inner;

public class Outer {

	static void outerStaticMethod(){
		
	}
	
	public void outerInstanceMethod(){
		
		Inner myInstance = new Inner();
		
		// We can access private members of static inner here
		myInstance.innerInstanceMethod();
		
	}
	
	public static class Inner {
		
		public int magic_number = 8324;
		
		private void innerInstanceMethod(){
			
			// We can access static members of outer class
			outerStaticMethod();
		}
	}

}


class SomeOtherClass {
	
	void someOtherMethod(){

		// If we were in another package entirely:
		// Without using import
		// com.fdmgroup.inners.statics.Outer.Inner instance = 
		//	new com.fdmgroup.inners.statics.Outer.Inner();
				
		// Creating an instance outside of the outer class
		// without static import:

		Outer.Inner myInstance = new Outer.Inner(); 
		
		// With static import -- can use name of inner class directly!
		Inner myOtherInstance = new Inner();
		
		// What if this was an instance inner class? 
		// Do you remember how to instantiate one from here?
		

	}
	

}







