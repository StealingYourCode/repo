package com.fdm.GenericsExample;

public class User implements Storable {

	private String username;
	
	public User(String username){
		this.username = username;
	}
	
	@Override
	public String getId() {
		return username;
	}

}
