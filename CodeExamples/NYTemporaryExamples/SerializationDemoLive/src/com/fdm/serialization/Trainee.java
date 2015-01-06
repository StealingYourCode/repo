package com.fdm.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Trainee extends Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	private String email;
	
	private transient Stream stream;
	
	
	private void writeObject(ObjectOutputStream oos)
			throws IOException
	{
	
		oos.writeInt(getId());
		oos.writeUTF(getStream().getName());
		oos.defaultWriteObject();
	}
	
	private void readObject(ObjectInputStream ois) 
			throws IOException, ClassNotFoundException
	{

		setId(ois.readInt());
		
		Stream stream = new Stream();
		stream.setName(ois.readUTF());
		
		setStream(stream);
		
		ois.defaultReadObject();
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Stream getStream() {
		return stream;
	}
	public void setStream(Stream stream) {
		this.stream = stream;
	}
	
	
}
