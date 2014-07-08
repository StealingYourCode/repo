package com.fdmgroup.rentals;

import java.util.List;


public class GenericRental<T> {
	private List<T> pool;
	
	public GenericRental(List<T> pool){
		this.pool = pool;
	}
	
	public T getOne(){
		return pool.get(0);
	}
	
	public void returnOne(T item){
		pool.add(item);
	}
}
