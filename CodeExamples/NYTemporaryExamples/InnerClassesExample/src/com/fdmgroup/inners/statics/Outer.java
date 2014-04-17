package com.fdmgroup.inners.statics;

import static com.fdmgroup.inners.statics.Outer.StaticInnerClass;


public class Outer {

	private static String secrets = "secrets";
	
	
	public void method(){
		 int x = StaticInnerClass.innerSecrets + 2;
	}

	
	public static class StaticInnerClass {
		
		private static int innerSecrets = 8324;
		
		private void innerInstanceMethod(){
			
			// We can access static members of outer class
			Outer.secrets.toString();
			
		}
	}

}


class SomeOtherClass {
	
	public static class StaticInnerClass{}
	
	void someOtherMethod(){

	
		// Creating an instance outside of the outer class
		Outer.StaticInnerClass myInstance = new Outer.StaticInnerClass(); 
		
		
		StaticInnerClass myOtherInstance = new StaticInnerClass();

		
		
		/* 
		 
		import com.mockito.Mockito;
		
		Without: 
				com.mockito.Mockito myInstance = new com.mockito.Mockito();
				com.mockito.Mockito.mock();
				com.mockito.Mockito.stub();
		With:   
				Mockito myInstance = new Mockito();
				Mockito.mock();
				Mockito.stub();
		
		
		import static com.mockito.Mockito.*;
		
		Without:
		
				com.mockito.Mockito.mock();
				com.mockito.Mockito.stub();
				
		With:
				mock();
				stub();
		
		*/
		
		
		
		
		// With static import -- can use name of inner class directly!
		// Inner myOtherInstance = new Inner();
		 
		// Remember how to instantiate an instance inner class? 

	}
	

}







