package com.fdmgroup;

import java.util.*;
import javax.persistence.*;

public class HelloWorld {

	public static void main(String[] args) {

		// Start EntityManagerFactory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("helloworld");

		// First unit of work - insert statement
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		Message message = new Message("Hello World with JPA");
		em.persist(message);

		message = new Message("This is message 2");
		em.persist(message);

		message = new Message("This is message 3");
		em.persist(message);
		
		// Second unit of work - select statement
		List messages =	em.createQuery("SELECT m FROM Message m ORDER BY m.text ASC").getResultList();

		System.out.println( messages.size() + " message(s) found:" );

		for (Object m : messages) {
			Message loadedMsg = (Message) m;
			System.out.println(loadedMsg.getText());
		}
		

/* This should be done by delegates so they get a feel of JPA */
		//third unit of work - finding and deleting.
//		message.setId((long) 3);
//		System.out.println(message.getId());
//		em.remove(em.find(Message.class, message.getId()));

		et.commit();
		em.close();
		
		// Shutting down the application
		emf.close();
	}
}