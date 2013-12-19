package com.fdmgroup.jdbc;

public class User 
{
	private int id;
	private String first_name;
	private String last_name;
	private int age;
	
	User(){}
	
	User(int id, String fn, String ln, int age)
	{
		this.id = id;
		this.first_name = fn;
		this.last_name = ln;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
