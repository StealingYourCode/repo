package com.examples.store;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Store {
	
	static List<Product> inventory = new ArrayList<Product>();
	static List<Department> departments = new ArrayList<Department>();
	
	
	
	
	public static void printDB(EntityManager em){
	
		/* ----- Sync Department and Product lists with DB ---- */
		
		
		departments = null;
		inventory = null;
		
		
		Query query = em.createNativeQuery(
				"SELECT * FROM JPA_DEPT", Department.class);

		departments = (List<Department>)query.getResultList();

		
		query = em.createNativeQuery(
				"SELECT * FROM JPA_PRODUCT", Product.class);

		inventory = query.getResultList();
		

		/* ----- Lists are loaded from DB. Let's print them out. ----- */
		

		for(Department d : departments)
			System.out.println(d.name);
		
		for(Product p : inventory)
			System.out.println("\n"+p);
		
	}
	
	
	
	public static void main(String[] args){

		EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("storepersistence");

		EntityManager em = emf.createEntityManager();

		/* ----- Insert a Department ----- */
		
		Department d = new Department("Fruit");
		d.setID(1);
		
		departments.add(d);
		
		
		// Open transaction
		em.getTransaction().begin();
		
		em.persist(d);
		
		em.getTransaction().commit();
	
		
		/* ----- Insert a Product ----- */
		
		
		Product p = new Product();
		
		p.setItemID(1);
		p.setDollarPrice(10);
		p.setItemName("pineapple");
		p.setQuantityInStock(1);
		p.setDept(departments.get(0));
		
		inventory.add(p);
		
		em.getTransaction().begin();
		
		em.persist(p);
		
		em.getTransaction().commit();
		
		
		
		/* ----- Insert another Department ----- */
		
		Department d2 = new Department("Jewelry");
		d2.setID(2);
	
		departments.add(d2);
		
		em.getTransaction().begin();
		
		em.persist(d2);
		
		em.getTransaction().commit();
	
		
		
		/* ----- Populate lists with data from DB and print ----- */

		printDB(em);
		
		
		/* ----- Pineapples suddenly double in price ----- */

		em.getTransaction().begin();
		
		for(Product prod : inventory) {
			
			if(prod.itemName.equals("pineapple") )
				prod.setDollarPrice(prod.getDollarPrice() * 2);
			
		}
		
		em.getTransaction().commit();
		
		
		/* ----- New shipment of diamond rings ----- */

		
		Product p2 = new Product();
		
		p2.setItemID(2);
		p2.setDollarPrice(1000);
		p2.setItemName("diamond ring");
		p2.setQuantityInStock(50);
		p2.setDept(departments.get(1));
		
		inventory.add(p2);
		
		
		em.getTransaction().begin();
		
		em.persist(p);
		
		em.getTransaction().commit();
		


		
		/* ----- Sale on diamond rings ----- */
		
		em.getTransaction().begin();
		
		for(Product product : inventory)
			if(product.getItemName().equals("diamond ring"))
				product.setDollarPrice(1);
		
		em.getTransaction().commit();
		
		
		
		
		/* ----- No more diamond rings ----- */
		
		em.getTransaction().begin();
		
		for(Product product : inventory)
			if(product.getItemName().equals("diamond ring"))
				em.remove(product);
		
		em.getTransaction().commit();

		
		/* ----- Populate lists with data from DB and print ----- */

		printDB(em);
		
		/* ----- Close EntityManager and EntityManagerFactory when done ----- */
		
		em.close();

	}
	
}

