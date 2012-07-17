package com.fdmgroup.anonymous;

public class App {
	public static void main(String[] args) {
		//Anonymous inner class
		MyInterface mi = new MyInterface() {

			public void myMethod() {
				myOtherMethod();
				System.out.println("Calling myMethod");
			}

			public void myOtherMethod() {
				System.out.println("Calling myOtherMethod");
			}
		};
		mi.myMethod();
		/*mi.myOtherMethod(); -->this cannot be called here, only inside 
		 the method from the interface*/

		//local inner class
		class MyClass implements MyInterface {

			public void myMethod() {
				System.out.println("Calling myMethod");
			}

			public void myOtherMethod() {
				System.out.println("Calling myOtherMethod");
			}	
		}
		MyClass mc = new MyClass();
		mc.myMethod();
		mc.myOtherMethod();
	}
}