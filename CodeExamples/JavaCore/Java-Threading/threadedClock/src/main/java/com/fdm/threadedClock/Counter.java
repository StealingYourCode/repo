package com.fdm.threadedClock;

import org.apache.log4j.Logger;

public class Counter implements Runnable {

	private Logger log = Logger.getLogger(Counter.class);
	
	private int lowerLimit;
	private int upperLimit;
	private int counter;
	private Counter childCounter;
	private boolean iterated = false;
	
	public void setChildCounter(Counter childCounter){
		this.childCounter = childCounter;
	}
	
	public void setLowerLimit(int lowerLimit){
		this.lowerLimit = lowerLimit;
	}
	
	public void setUpperLimit(int upperLimit){
		this.upperLimit = upperLimit;
	}
	
	private void setCounter(int initialCounter){
		this.counter = initialCounter;
	}
	
	public Counter(){
	}
	
	public Counter(int lowerLimit, int upperLimit){
		setLowerLimit(lowerLimit);
		setUpperLimit(upperLimit);
	}
	public Counter(int lowerLimit, int upperLimit, int initialCounter){
		this(lowerLimit,upperLimit);
		setCounter(initialCounter);
	}
	
	@Override
	public void run() {
		while(true){
			if(childCounter == null){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				iterate();
				synchronized(this){
					this.notifyAll();
				}
			} else {
				synchronized(childCounter){
					try {
						childCounter.wait();
					} catch (InterruptedException e) {
						log.warn("Counter was interrupted");
					}
					if(childCounter.iterated()){
						iterate();
					}
				}
			}
		}
	}
	
	private void iterate(){
		counter++;
		if(counter >= upperLimit){
			counter = lowerLimit;
			iterated = true;
			synchronized(this){
				this.notifyAll();
			}
		} else {
			iterated = false;
		}
	}
	
	public boolean iterated(){
		if(iterated == true){
			iterated = false;
			return true;
		}
		return false;
	}
	
	public String toString(){
		return counter+"";
	}

}
