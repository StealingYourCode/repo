package com.fdm.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		
		Trainee trainee = new Trainee();
		Stream stream = new Stream();
		
		trainee.setFirstName("Ricky");
		trainee.setLastName("Tan");
		trainee.setEmail("rt@rt.com");
		
		trainee.setId(300);
		
		stream.setName("Python");
		
		trainee.setStream(stream);
		
		/* Serializing... */
		
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream("ricky_object.ser");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(trainee);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		
	
			try {
				fis = new FileInputStream("ricky_object.ser");			
				ois = new ObjectInputStream(fis);
				
				Object rickyObject = ois.readObject();
				
				if(rickyObject instanceof Trainee){
					Trainee ricky = (Trainee)rickyObject;
					
					System.out.println("ID: " + 
							ricky.getId()+
							"\n"
							+ ricky.getFirstName() + 
							" is in the " + 
							ricky.getStream().getName() + 
							" stream."
							);
				}
				
				
				
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally{
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

	
			
		

	}

}
