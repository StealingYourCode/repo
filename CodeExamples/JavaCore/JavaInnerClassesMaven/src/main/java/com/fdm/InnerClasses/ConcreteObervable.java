package com.fdm.InnerClasses;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObervable implements Observable, Command {

	private List<Observer> observers;
	private String message;
	
	{
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void execute(){
		message = "Hello World!";
		updateAll();
	}
	
	@Override
	public String getState() {
		return message;
	}

	@Override
	public void updateAll() {
		for(Observer o : observers){
			o.update(this);
		}
	}

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

}











