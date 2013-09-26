package com.fdmgroup.collections;

import java.util.ArrayList;   
import java.util.Calendar;
import java.util.Collections;   
import java.util.Date;   
import java.util.List;   
   
  
public class TestEmployeeSorting 
{   
	public static void main(String[] args) 
	{   
		Employee e1 = new Employee(1,"A",20000.00,Calendar.getInstance());   
		Employee e2 = new Employee(2,"A",22000.00,Calendar.getInstance());   
		Employee e3 = new Employee(3,"A",10000.00,Calendar.getInstance());   
		Employee e4 = new Employee(4,"F",19000.00,Calendar.getInstance());   
		Employee e5 = new Employee(5,"E",24000.00,Calendar.getInstance());   
		List<Employee> list = new ArrayList<Employee>();   
		list.add(e1);list.add(e2);list.add(e3);list.add(e4);list.add(e5);
		
		// 	PRINT BEFORE SORTING   
		System.out.println("BEFORE SORTING");   
		System.out.println("===============================================================");   
		System.out.println("ID\t\t Name\t\t Salary\t\t Date Of Joining");   
		System.out.println("===============================================================");   
		for (Employee employee : list) 
		{   
			Calendar cal = employee.getDateOfJoining();
			System.out.println(employee.getEmpId()+"\t\t "+employee.getName()   
		    +"\t\t"+employee.getSalary()+"\t\t "+ cal.DAY_OF_MONTH+"-"+cal.MONTH+"-"+
					cal.YEAR);   
		}   
  
		// sorting the Employee object   
		Collections.sort(list);   
		
		// PRINT AFTER SORTING   
		System.out.println("\n\nAFTER SORTING");   
		System.out.println("===============================================================");   
		System.out.println("ID\t\t Name\t\t Salary\t\t Date Of Joining");   
		System.out.println("===============================================================");   
		for (Employee employee : list) 
		{   
			Calendar cal = employee.getDateOfJoining();
			System.out.println(employee.getEmpId()+"\t\t "+employee.getName()   
				+"\t\t"+employee.getSalary()+"\t\t "+   
			cal.DAY_OF_MONTH +"-"+cal.MONTH+"-"+cal.YEAR);   
		}   
	}   
}  

