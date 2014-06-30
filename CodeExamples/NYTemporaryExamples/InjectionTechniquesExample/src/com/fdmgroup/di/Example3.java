package com.fdmgroup.di;

import com.fdmgroup.di.dependencies.Dependency;

public class Example3 {

	private Dependency dep = null;
	
	// Constructor Injection
	public Example3(Dependency dep){
		this.dep = dep;
	}
	
	// Setter Injection
	public void setDependency(Dependency dep){
		this.dep = dep;
	}
		
	public void doSomething(){
		dep.doWork();
	}
}

// Dependency Injection:
// Objects the class needs are passed into it from the outside.
// The class does not need to create any objects.