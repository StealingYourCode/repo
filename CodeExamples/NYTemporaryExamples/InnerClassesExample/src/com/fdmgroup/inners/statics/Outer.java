package com.fdmgroup.inners.statics;

import static com.fdmgroup.inners.statics.Outer.Inner;

public class Outer {

	static void outerStaticMethod(){
		
	}
	
	public void outerInstanceMethod(){
		
		Inner myInstance = new Inner();
		
		myInstance.innerInstanceMethod();  // private method
		
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

	
		// Creating an instance outside of the outer class
		Outer.Inner myInstance = new Outer.Inner(); 
		
		// With static import -- can use name of inner class directly!
		Inner myOtherInstance = new Inner();
		
		// Remember how to instantiate an instance inner class? 

	}
	

}







