package Threading;

import java.util.Vector;

public class ThreadOrganizer {

	public ThreadOrganizer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException		
	{			
//		The myRunnable object will be used by all threads 
//		and will have the same counter object. 
//		So we should be able to see problems such as a race condition
					
		Counter count = new Counter();
		MyRunnable myRunnable = new MyRunnable(count);
			
		Vector<Thread> allThreads = new Vector<Thread>();
			
		for (int i=0; i<6; i++)
		{
			//each thread gets a runnable object and a name
			allThreads.add(new Thread(myRunnable, "thread"+i));			
		}
		
		
//		Before we say t.start, the threads are thread objects, 
//		but they are not yet true threads. 
//		The threads are currently in a new state
			
//		Now we say t.start and the threads are moved to the runnable state. 
//		Each also gets a new stack. 
//		Soon the run() method will be called. 
		for (Thread t : allThreads)
		{
			t.start();
		}
		
		
		for (Thread t : allThreads)
		{
			t.join();			
		}
		
		
//		At the end of all the threads executing, I want to 
//		display a total, which should be 60 (because I've 
//		incremented counter 10 times for 6 threads)
//		see that I join the current thread(which is main) 
//		to the end of all the threads. This ensures that the 
//		system.out.println happens after all the threads have 
//		executed.  See what happens if you make 60 threads. 

		System.out.println("The number of times counter was incremented is: "
		  +myRunnable.counter.getCount());
		System.out.println("The sum of all counters is: "+myRunnable.total);
		System.out.println("The math result is: "+myRunnable.math);
	}
}
