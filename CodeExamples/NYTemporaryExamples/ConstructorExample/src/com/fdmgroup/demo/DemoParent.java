package com.fdmgroup.demo;

public class DemoParent {

	String	name;
	String	age;
	String	address;
	String	favoriteColor;

	public DemoParent(String name, String age, String address,
			String favoriteColor) {

		this.name = name;
		this.age = age;
		this.address = address;
		this.favoriteColor = favoriteColor;
	}

	public DemoParent(String name, String age, String address) {

		this(name,age,address,"default");
	}

	public DemoParent(String name, String age) {

		this(name,age,"default");
	}
	
	public DemoParent(String name) {

		this(name,"default");
	}
	


}
