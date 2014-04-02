package com.fdmgroup.examples;

public class ThreadingExample {

	public static void main(String[] args)
	{		
	
		
		new MyBasicThread("London").start();
		new MyBasicThread("Moscow").start();

		
		for (int i = 0; i<10 ; i++)
			System.out.println(i+ " main() code");

		System.out.println("... end of main()");
		
		
	}
}


class MyBasicThread extends Thread {
	
	// Sets the name
    public MyBasicThread(String str) {
    	super(str);
    }
    
    public void run() {
    	
		
    	for (int i = 0; i < 10; i++) {
		    
    		System.out.println(i + " " + getName());

    		try {
    		
    			sleep((int)(Math.random() * 1000)); 			
    			
		    } catch (InterruptedException e) { 	e.printStackTrace();  }
		}
	
		System.out.println("DONE! " + getName());
    }
}













