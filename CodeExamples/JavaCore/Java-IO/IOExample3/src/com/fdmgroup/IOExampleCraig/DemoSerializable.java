package com.fdmgroup.IOExampleCraig;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class DemoSerializable {

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
			ObjectOutputStream oos = null;
			try {
				FileOutputStream fos = new FileOutputStream("student.ser");
				oos = new ObjectOutputStream(fos);
				
				//Person myPerson = new Person("Philip","Kim", 1313, "Mockingbird Lane");
				Person myPerson = new Student("Philip","Kim", 1313, "Mockingbird Lane", "Java");
				oos.writeObject( myPerson);
				
				//myPerson = new Person("Benjamin","Garret", 221, "Laurel Street");
				myPerson = new Student("Benjamin","Garret", 221, "Laurel Street", "App Support");				
				oos.writeObject( myPerson);
				
				//oos.flush();
				
			} 
			catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				oos.close();
			}
		}else{
			FileInputStream fos = null;
			ObjectInputStream ois = null;
			try {
				fos = new FileInputStream("student.ser");
				ois = new ObjectInputStream(fos);
				
				while(true)
				{
					Person myPerson = (Student) ois.readObject(); // Object restored.
					
					System.out.println(myPerson);
					
				}
				/*
					Person myPerson = (Person) ois.readObject(); // Object restored.
					
					System.out.println(myPerson);
				*/
			} catch (EOFException e) {
			
				
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				ois.close();
			}
		}
	}

}

class Person implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 0L;
	/**
	 * 
	 */
	private String firstname; 
	private String lastname;	
	private Address home;
	
	Person()
	{
		
	}
	Person(String firstname, String lastname, int housenumber, String StreetName)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		home = new Address(housenumber, StreetName);
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String toString()
	{
		return "Student " + firstname + " " + lastname + " lives at " + home;
	}
}


class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String Add_Street;
	private int Add_Number;
	
	public Address(int hn, String s)
	{
		setStreet(s);
		setNumber(hn);
	}

	public int getNumber() {
		return Add_Number;
	}

	public void setNumber(int add_Number) {
		Add_Number = add_Number;
	}

	public String getStreet() {
		return Add_Street;
	}

	public void setStreet(String add_Street) {
		Add_Street = add_Street;
	}
	
	public String toString()
	{
		return Add_Number + " " + Add_Street;
	}
}
class Student extends Person implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String courseStudied;

	Student(String firstname, String lastname, int housenumber,
			String StreetName, String course) {
		super(firstname, lastname, housenumber, StreetName);
		courseStudied = course;
	}
	public String toString()
	{
		return super.toString() + " and takes the " + courseStudied + " course.";
		
	}

	private void writeObject(ObjectOutputStream out) throws IOException
	{
		System.out.println("Serialzing student");
		
		out.defaultWriteObject();
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
	{
		System.out.println("Deserializing student");
		in.defaultReadObject();
	}

}
