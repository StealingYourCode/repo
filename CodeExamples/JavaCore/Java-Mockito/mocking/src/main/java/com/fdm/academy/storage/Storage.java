package com.fdm.academy.storage;

public interface Storage{
	
	void store(Object object);
	Object retrieve(String id);
	
}