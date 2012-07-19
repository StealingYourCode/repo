package com.fdm.springCoreIntro;

import org.apache.log4j.Logger;

public class User {

	private String username;
	private String password;
	
	private static Logger log = Logger.getLogger(User.class);
	
	public User(){
	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
		log.info("Set username and password");
	}
	public User(int age, String address){
		this.username = age+"";
		this.password = address;
		log.info("Setting age and address");
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void complete(){
		log.info(username+" "+password);
	}
}
