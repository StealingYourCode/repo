package com.fdm.threadedClock;

import org.apache.log4j.BasicConfigurator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	BasicConfigurator.configure();
        Counter seconds = new Counter(0,10,0);
        Counter minutes = new Counter(0,10,0);
        Counter hours = new Counter(0,2,0);
        minutes.setChildCounter(seconds);
        hours.setChildCounter(minutes);
        Thread sT = new Thread(seconds);
        Thread mT = new Thread(minutes);
        Thread hT = new Thread(hours);
        hT.start();
        mT.start();
        sT.start();
        while(true){
        	synchronized(seconds){
        		seconds.wait();
        		System.out.println(hours+":"+minutes+":"+seconds);
        	}
        }
    }
}
