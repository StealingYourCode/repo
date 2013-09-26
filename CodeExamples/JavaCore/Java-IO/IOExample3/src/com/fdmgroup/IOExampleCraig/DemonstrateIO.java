package com.fdmgroup.IOExampleCraig;

import	java.io.*;
import java.util.Scanner;


public class DemonstrateIO {

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
			DataOutputStream DOS = new DataOutputStream(new FileOutputStream("OutputFile.dos"));

			System.out.println("Please enter text to be stored:");
			value = in.nextLine();
			
			DOS.writeUTF(value);
			
			System.out.println("Please enter integer to be stored:");
			int intvalue = in.nextInt();
			
			//DOS.writeInt(100);
			DOS.writeInt(intvalue);
			//DOS.writeInt(-20);
			System.out.println("Please enter double to be stored:");
			double dblvalue = in.nextDouble();
			
			DOS.writeDouble(dblvalue);
			
			DOS.close();
			

		}
		else
		{
			FileInputStream FIS = new FileInputStream("OutputFile.dos");
			DataInputStream DIS = new DataInputStream(FIS);
			
			System.out.println("String stored was: " + DIS.readUTF());
			System.out.println("Int stored was: " + DIS.readInt());
			System.out.println("Double stored was: " + DIS.readDouble());
			
			DIS.close();
		}

	}

}
