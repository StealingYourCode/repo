package com.fdmgroup.io;
import java.io.*;


public class MixingData 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File file1 = new File("mixing.txt");
		
		try {
			OutputStreamWriter osw = 
					new OutputStreamWriter(
							new FileOutputStream("out.txt"));
		
			
			osw.write('r');
			
			osw.flush();
			osw.close();
			
			InputStreamReader isr = 
					new InputStreamReader(
							new FileInputStream("out.txt"));
			
			char r = (char)isr.read();
			System.out.println(r);
			
//			DataOutputStream dos = new DataOutputStream(new FileOutputStream(file1));
//			DataInputStream dis = new DataInputStream(new FileInputStream(file1));
//			dos.writeInt(125);
//			dos.flush();
//			dos.close();
//			
//			int newInt = dis.readInt();
//			System.out.println("New int is: "+newInt);
//			dis.close();
		} 
		catch (FileNotFoundException e) 
		{		
			e.printStackTrace();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		

	}

}
