package com.fdm.InnerClasses;

public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 * Anonymous
    	 */
        Observer observer = new Observer(){
			@Override
			public void update(Observable observable) {
				System.out.println(observable.getState());
			}
        };
        
        /*
         * Local
         */
        class ConcreteObserver implements Observer{
			@Override
			public void update(Observable observable) {
				displayMessage();
				System.out.println("Concrete says: "+observable.getState());
			}
			public void displayMessage(){
				System.out.println("Some other message");
			}
        }
        
        
        ConcreteObserver co = new ConcreteObserver();
        co.displayMessage();
        
        ConcreteObervable ob = new ConcreteObervable();
        ob.attach(observer);
        ob.attach(co);
        
        ((Command)ob).execute();
        
    }
}
