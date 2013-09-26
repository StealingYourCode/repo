package com.fdmgroup.IOExampleCraig;

import	java.io.*;
import java.nio.CharBuffer;
import java.util.Scanner;


public class DemonstrateCharIO {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Do you want to (r)ead or (w)rite?");
		
		String option = in.nextLine();
		String value = null;
		if(option.equals("w"))
		{
			FileWriter FW = new FileWriter("OutputCharFile.FW",false);

			System.out.println("Please enter text to be stored:");
			value = in.nextLine();
			
			FW.write(value);
			
			System.out.println("Please enter integer to be stored:");
			int intvalue = in.nextInt();
			
			FW.write(Integer.toString(intvalue));

			System.out.println("Please enter double to be stored:");
			double dblvalue = in.nextDouble();
			
			FW.write(Double.toString(dblvalue));
			
			FW.close();
			

		}
		else
		{
			FileReader fr = new FileReader("OutputCharFile.FW");
			char[] cb = new char[100];
			for(int i =0; i <cb.length; i++)
			{
				cb[i] = 0;
			}
			fr.read(cb);
			System.out.print("Value Read in:");
			for(int i =0; i <cb.length && cb[i] != 0; i++)
			{
				System.out.print((char)cb[i]);
			}
				
			fr.close();
		}

	}
	

}

