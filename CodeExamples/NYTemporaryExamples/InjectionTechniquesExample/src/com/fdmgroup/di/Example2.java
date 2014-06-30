package com.fdmgroup.di;

import com.fdmgroup.di.dependencies.Dependency;
import com.fdmgroup.di.registry.DepMap;

public class Example2 {

	private Dependency	dep	= null;

	public Example2() {

		DepMap dm = new DepMap();
		
		dep = (Dependency) dm.getBean("regular");		
	}

	public void doSomething() {

		dep.doWork();
	}
}

// Dependency Pull
// This class "pulls" what it needs from a registry,
// but are there any other issues?