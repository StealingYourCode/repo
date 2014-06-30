package com.fdmgroup.di;

import com.fdmgroup.di.dependencies.Dependency;

public class Example1 {

	private Dependency dep = null;

	public Example1() {

		dep = new Dependency();
	}
	
	public void doSomething(){
		
		dep.doWork();
	}
}

// What are the issues with this setup?