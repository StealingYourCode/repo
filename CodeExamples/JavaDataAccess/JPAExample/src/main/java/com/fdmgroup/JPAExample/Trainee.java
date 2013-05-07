package com.fdmgroup.JPAExample;

import javax.persistence.*;

//The @Entity annotation indicates this is a JPA Entity
@Entity
//Define table name if different from Entity name
@Table(name="trainee_table")
public class Trainee {
	
	//Declare an attribute of the Entity as a Primary Key Column
	@Id
	@Column
	private int traineeId;
	//Declare other attributes as Columns
	@Column
	private String username;
	//Define name of column in database if different from attribute name
	@Column (name="first_name")
	private String firstname;
	@Column (name="last_name")
	private String lastname;
	
	
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
