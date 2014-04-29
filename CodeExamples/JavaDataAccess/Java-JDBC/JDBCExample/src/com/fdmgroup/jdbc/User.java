package com.fdmgroup.jdbc;

public class User 
{
	private int test_Id;
	private String first_name;
	private String last_name;
	private int age;
	
	User(){}
	
	User(int id, String fn, String ln, int age)
	{
		this.test_Id = id;
		this.first_name = fn;
		this.last_name = ln;
		this.age = age;
	}
	

	public int getTest_Id(){
		return test_Id;
	}
	public void setTest_Id(int test_Id){
		this.test_Id = test_Id;
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
