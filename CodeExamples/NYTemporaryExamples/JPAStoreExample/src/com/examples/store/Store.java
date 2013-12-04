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
	
	public void printAll(){
		/* ----- Print all ----- */

		for(Department d : departments)
			System.out.println(d.name);
		
		for(Product p : inventory)
			System.out.println("\n"+p);
		
	}
	
	public static void main(String[] args){

		Store myStore = new Store();
		
		EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("storepersistence");

		EntityManager em = emf.createEntityManager();

		
		
		/* ----- Get all departments ---- */
		
		
		Query query = em.createNativeQuery(
				"SELECT * FROM JPA_DEPT", Department.class);

		myStore.departments = (List<Department>)query.getResultList();

		

		

		/* ----- Departments are loaded ----- */
		 
		
		query = em.createNativeQuery(
				"SELECT * FROM JPA_PRODUCT", Product.class);

		myStore.inventory = query.getResultList();
		
		
		
		
		
		/* ----- Inventory is loaded ----- */
		
		//myStore.printAll();

		/* ----- Pineapples suddenly double in price ----- */

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
		
		

		//myStore.printAll();

		/* ---- */
		
		em.getTransaction().begin();
		
		for(Product product : myStore.inventory)
			if(product.getItemName().equals("diamond ring"))
				product.setDollarPrice(1);
		
		em.getTransaction().commit();
		
		
		
		
		/* ----- Forget the diamonds ----- */
		
		em.getTransaction().begin();
		
		for(Product product : myStore.inventory)
			if(product.getItemName().equals("diamond ring"))
				em.remove(product);
		
		em.getTransaction().commit();
		
		
		em.close();
		
		// At this point,
		// diamond ring is not in the DB
		// but still in our program
		// accessible through myStore.inventory
		myStore.printAll();
	}
	
}

