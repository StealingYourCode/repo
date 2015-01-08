package com.fdm.inner.local;

public class Outer {

	public void someMethod(){	
		class Local {}		
	}
	public void anotherMethod(){
		class Local {}
	}
}

class AnotherClass{
	public void someMethod(){
		class Local {}
	}
}

// Outer.class
// Outer$1Local.class
// Outer$2Local.class
// AnotherClass.class