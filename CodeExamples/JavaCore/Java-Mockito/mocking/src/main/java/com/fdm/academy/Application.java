package com.fdm.academy;

import com.fdm.academy.storage.*;

public class Application{
	
	Storage storage;
	
	public Application(Storage storage){
		this.storage = storage;
	}
	
    void process(Object object){
		storage.store(object);
	}
}
