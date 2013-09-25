package Threading;

public class MyRunnable implements Runnable 
{
	
	Counter counter; 	
	int total = 0;
	int math = 0;
	
	public MyRunnable(Counter count) 
	{
		this.counter = count;		
	}

	
//	When run is being executed the thread is in the running state.
	@Override	
	public void run() 
	{		
		counting();
	}
	
//	Try adding the keyword synchronized to the method and see that 
//  now all the results print in order.  Notice that each thread will increment
//	count all 10 times without being interrupted. Race condition resolved.
	public /*synchronized*/ void counting()
	{			
		for (int i=0; i<10; i++)
		{
			counter.incrementCount();
			total = total+counter.getCount(); //to see race condition
			math = total * counter.getCount();
					
//			Invoke static method Thread.currentThread which returns 
//			a reference to the currently executing thread.		
			String stuffToWrite="Run thread: "
			   +Thread.currentThread().getName()
			   +" Time: "+System.currentTimeMillis()
			   +" count: "+counter.getCount(); 			
					
			System.out.println(stuffToWrite);			
			
			
//			//See that slowing the threads down highlights
//			//the race condition problem.
//			try {						
//				Thread.sleep(20); //sleep for 20 milli-seconds				
//			}catch (InterruptedException e){}			
			
		}	
	}
}
