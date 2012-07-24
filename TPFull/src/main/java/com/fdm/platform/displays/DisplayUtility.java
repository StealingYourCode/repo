package com.fdm.platform.displays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DisplayUtility {

	private BufferedReader bufferedReader = 
			new BufferedReader(new InputStreamReader(System.in));
	
	public String getInputAsString() throws IOException
	{
		return bufferedReader.readLine();
	}
	
	public double getInputAsDouble() 
			throws NumberFormatException, IOException
	{
		return Double.parseDouble(getInputAsString());
	}
	
	public void writeToConsole(String toWrite)
	{
		System.out.println(toWrite);
	}
	
	public void writeItemToConsole(String optionNumber, String option)
	{
		System.out.println(optionNumber+option);
	}
}
