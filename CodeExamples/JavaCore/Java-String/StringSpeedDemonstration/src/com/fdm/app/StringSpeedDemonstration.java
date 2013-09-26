package com.fdm.app;

import com.fdm.service.StopWatch;

public class StringSpeedDemonstration {
	
	//sample usage
    public static void main(String[] args) {
    	
        StopWatch stopWatch = new StopWatch();
        
        //java.lang.StringBuffer
        stopWatch.start();
        StringBuffer stringBufferString = new StringBuffer();
        for(int i=0; i<10000000; i++)
        	stringBufferString.append("*");
        stopWatch.stop();
        System.out.println("StringBuffer test -- elapsed time in milliseconds: " + stopWatch.getElapsedTime());
    	
        //java.lang.StringBuilder
        stopWatch.start();
    	StringBuilder stringBuilderString = new StringBuilder();
    	for(int i = 0; i < 10000000; i++)
    		stringBuilderString.append("A");
    	stopWatch.stop();
    	System.out.println("StringBuilder test -- elapsed time in milliseconds: " + stopWatch.getElapsedTime());
    	
    	//java.lang.String
    	stopWatch.start();
    	String string = new String();
    	for(int i = 0; i < 100000; i++) // notice that iteration is 2 orders of magnitude less, yet takes the most amount of time
    		string += "A";
    	stopWatch.stop();
    	System.out.println("String test -- elapsed time in milliseconds: " + stopWatch.getElapsedTime());
        
    	
    	   	
    	
    }

}
