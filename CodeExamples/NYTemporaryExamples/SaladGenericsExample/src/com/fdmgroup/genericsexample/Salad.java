package com.fdmgroup.genericsexample;

import java.util.ArrayList;
import java.util.List;


public class Salad<T extends Food> implements ISalad<T> {

	List<T> innerList = new ArrayList<T>();
	
	@Override
	public void add(T t) {

		innerList.add(t);
		
	}

	@Override
	public List<T> serve() {

		return innerList;
	}

}
