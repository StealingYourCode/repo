package com.examples.store;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Store {
	
	List<Product> inventory = new ArrayList<Product>();
	List<Department> departments = new ArrayList<Department>();
	
	
	
	public static void main(String[] args){

		Store myStore = new Store();
		
		EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("storepersistence");

		EntityManager em = emf.createEntityManager();

		
		
		/* ----- Get all departments ---- 
		
		em.getTransaction().begin();
		
		Query query = em.createNativeQuery(
				"SELECT * FROM JPA_DEPT", Department.class);

		// Why are we getting a warning here?
		myStore.departments = query.getResultList();

		em.getTransaction().commit();
		
		
		/* ----- Print all ----- 

		for(Department d : myStore.departments)
			System.out.println(d.name);
		
		

		/* ----- Departments are loaded ----- 
		 
		em.getTransaction().begin();
		
		query = em.createNativeQuery(
				"SELECT * FROM JPA_PRODUCT", Product.class);

		myStore.inventory = query.getResultList();
		
		em.getTransaction().commit();
		
		for(Product p : myStore.inventory)
			
			System.out.println("\n"+p);
		
		/* ----- Inventory is loaded ----- */
		


		/* ----- Pineapples suddenly double in price ----- 
		
		em.getTransaction().begin();
		
		for(Product p : myStore.inventory) {
			
			if(p.itemName.equals("pineapple") )
				p.setDollarPrice(p.getDollarPrice() * 2);
			
		}
		
		// Commit to make a change
		em.getTransaction().commit();
		
		
		/* ----- New shipment of diamond rings ----- 

		
		Product p = new Product();
		
		p.setItemID(2);
		p.setDollarPrice(1000);
		p.setItemName("diamond ring");
		p.setQuantityInStock(50);
		p.setDept(myStore.departments.get(1));
		
		myStore.inventory.add(p);
		
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
		
		
		
		em.getTransaction().begin();
		
		for(Product product : myStore.inventory)
			if(product.getItemName().equals("diamond ring"))
				product.setDollarPrice(1);
		
		em.getTransaction().commit();
		
		
		
		
		/* ----- Forget the diamonds ----- 
		
		em.getTransaction().begin();
		
		for(Product product : myStore.inventory)
			if(product.getItemName().equals("diamond ring"))
				em.remove(product);
		
		em.getTransaction().commit();
		
		
		em.close();
		*/
	}
	
}

