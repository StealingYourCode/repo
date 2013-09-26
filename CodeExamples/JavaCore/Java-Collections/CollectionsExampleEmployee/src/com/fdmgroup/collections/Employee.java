package com.fdmgroup.collections;

import java.util.Calendar;
import java.util.Date;   
public class Employee implements Comparable<Employee>
{   
	private int empId;   
	private String name;   
	private double salary;   
	private Calendar dateOfJoining;	
	
	public Employee(int empId,String name,double salary, Calendar dateOfJoining)
	{   
	   this.empId = empId;
	   this.name =  name;   
	   this.salary =  salary;
	   this.dateOfJoining = dateOfJoining;   
	}   
	    
	@Override  
	public int compareTo(Employee o) 
	{   
	   if(o == null)
	   {   
		   throw new NullPointerException("compareTo: Argument passed is null");   
	   }   
	  
	   if(this.getClass().equals(o.getClass()))
	   {   
		   Employee e = (Employee) o;   
		   
		   return (this.getName()).compareTo(e.getName());
		   
		   //sort by Salary which is a double, first use Wrapper to convert it from primitive type
		   //return new Double(this.getSalary()).compareTo(new Double(e.getSalary()) );
	   }
	   else
	   {   
		   throw new ClassCastException("compareTo: Objects are not comparable");   
	   }   
	}   
	
	// setters and getters   
	public int getEmpId() {return empId;}   
	public void setEmpId(int empId) {this.empId = empId;}   
	public String getName() {return name;}   
	public void setName(String name) {this.name = name;}   
	public double getSalary() {return salary;}   
	public void setSalary(double salary) {this.salary = salary;}   
	public Calendar getDateOfJoining() {return dateOfJoining;}   
	public void setDateOfJoining(Calendar dateOfJoining) {this.dateOfJoining = dateOfJoining;}   
}   
	 
	
