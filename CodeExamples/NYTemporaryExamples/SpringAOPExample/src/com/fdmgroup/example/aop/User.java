package com.fdmgroup.example.aop;

import java.util.Random;

public class User {

	private String	name;
	private String	message;

	public User(String name, String message) {

		setName(name);
		setMessage(message);
	}

	public User() {

	}

	public void work() {

		System.out.println("[User.work()]");
	}

	public void play(double x) {

		System.out.println("[User.play("+x+")]");
	}

	public User getInstance() {

		User user = new User();
		user.setName("Hao");
		user.setMessage("I don't know");
		if (new Random().nextBoolean()) {
			System.out.println("[User.getInstance()]");
			return user;
		}
		else {
			System.out.println("User: Throwing NullPointerException!");
			throw new NullPointerException();
		}
	}

	public String toString() {

		return "User " + name + ": " + message;
	}

	public String getMessage() {

		return message;
	}

	public void setMessage(String message) {

		this.message = message;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}
}
