package com.fdm.InnerClasses;

public interface Observable {
	String getState();
	void updateAll();
	void attach(Observer observer);
}
