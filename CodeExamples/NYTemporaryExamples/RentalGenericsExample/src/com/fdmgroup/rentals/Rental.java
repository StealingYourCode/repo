package com.fdmgroup.rentals;

import java.util.List;

// Rents out objects, accepts returns
public class Rental {
	
	// Pool of objects
	private List pool;
	
	public Rental(List pool){
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
