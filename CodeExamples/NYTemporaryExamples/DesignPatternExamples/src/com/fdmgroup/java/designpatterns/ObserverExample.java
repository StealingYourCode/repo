package com.fdmgroup.java.designpatterns;

import java.util.List;

interface ObservableSubject {
	
	void attach(Observer o);
	void detach(Observer o);
	void notifyObservers();
}

class Newspaper implements ObservableSubject {
	
	String latestNews;
	List<Observer> observers;
	
	void updateLatestNews(){
		
		// latestNews is updated
		// all Observers are notified of the update
		notifyObservers();
	}

	String getLatestNews(){
		return latestNews;
	}
	
	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		
		for (Observer o : observers)
			o.update();
	}
}

interface Observer {
	abstract void update();
}

class Subscriber implements Observer {

	// Subscriber's copy of the latest news
	String latestNews;
	
	// Newspaper we are subscribing to 
	Newspaper newspaper;
	
	@Override
	public void update() {
		latestNews = newspaper.getLatestNews();
	}
	
}



public class ObserverExample {

}
