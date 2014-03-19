package com.fdmgroup.rentalexample;

import java.util.List;

// Rents out objects, accepts returns
public class Rental {
	
	// Pool of objects
	private List<Object> pool;
	
	public Rental(List<Object> pool){
		this.pool = pool;
	}
	
	public Object getOne(){
		
		if(pool == null)
			return null;
		
		if(pool.isEmpty())
			return null;
		
		return pool.remove(0);
	}
	
	public void returnOne(Object returnItem){
		pool.add(returnItem);
	}

}
