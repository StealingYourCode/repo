package com.fdm.platform.giveToTrainees;

public class UserAccountDTO {

	private final String username;
	private final String password;
	private final boolean isAdmin;
	private final boolean isBanned;
	
	public UserAccountDTO(String username, String password, boolean 
			isAdmin, boolean isBanned)
	{
		this.username=username;
		this.password=password;
		this.isAdmin=isAdmin;
		this.isBanned=isBanned;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public boolean isBanned() {
		return isBanned;
	}
	
}
