package com.fdmgroup.jpa;

import javax.persistence.*; 
import java.util.List; 
 
public class EmployeeTest { 
 
    public static void main(String[] args) { 
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("EmployeeService"); 
        EntityManager em = emf.createEntityManager(); 
        EmployeeService service = new EmployeeService(em);
        
    //  create and persist an employee 
        em.getTransaction().begin(); 
        Employee emp = service.createEmployee(158, "John Doe", 45000); 
        em.getTransaction().commit(); 
        System.out.println("Persisted " + emp.getName()); 
 
        // find a specific employee 
        emp = service.findEmployee(158); 
        System.out.println("Found " + emp.getName()); 
        // find all employees 
        List<Employee> emps = service.findAllEmployees(); 
        for (Employee e : emps) 
            System.out.println("Found employee: " + e.getName());  
 
        // update the employee 
        em.getTransaction().begin(); 
        emp = service.raiseEmployeeSalary(158, 1000); 
        em.getTransaction().commit(); 
        System.out.println("Updated " + emp.getName());

       /* // remove an employee 
        em.getTransaction().begin(); 
        service.removeEmployee(158); 
        em.getTransaction().commit(); 
        System.out.println("Removed Employee 158"); */
 
        // close the EM and EMF when done 
        em.close(); 
        emf.close(); 
    } 
}
