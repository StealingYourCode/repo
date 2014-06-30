package com.fdmgroup.di.registry;

import java.util.HashMap;
import java.util.Map;

import com.fdmgroup.di.dependencies.Dependency;
import com.fdmgroup.di.dependencies.SpecializedDependency;


public class DepMap {

	private Map<String,Dependency> depMap = 
			new HashMap<String,Dependency>();
	
	public DepMap(){
		
		depMap.put("regular", new Dependency());
		depMap.put("specialized", new SpecializedDependency());
		

	}
	
	public Dependency getBean(String key) {
		
		// Gives us a Dependency object, 
		// usually from some kind of registry
		return depMap.get(key);
	}

}
