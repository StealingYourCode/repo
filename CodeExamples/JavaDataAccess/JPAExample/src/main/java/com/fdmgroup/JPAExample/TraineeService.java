package com.fdmgroup.JPAExample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class TraineeService {

	private EntityManagerFactory emf;

	public TraineeService(EntityManagerFactory emf){
		this.emf = emf;
	}

	//Best practise is to use a new EntityManager per transaction, so create a method to get one.
	//Compare this to a 'getConnection()' method in JDBC
	//Don't forget to close this once your transaction is complete!
	public EntityManager getEntityManager(){
		return emf.createEntityManager();
	}

	//Write a Trainee to the database
	public Trainee persistTrainee(Trainee t){
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(t);
		et.commit();
		em.close();
		return t;
	}

	//Remove a Trainee from the database if they exist
	public void removeTrainee(int id) { 
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		Trainee t = em.find(Trainee.class, id);
		try{
			if (t != null) {
				et.begin();
				em.remove(t);
				et.commit();
			}
		}
		finally{
			em.close();
		}
	}

	//Update an existing Trainee's first name
	public void updateTraineeFirstName(Trainee t){
		EntityManager em = getEntityManager();
		EntityTransaction et = em.getTransaction();
		Trainee existingTrainee = em.find(Trainee.class, t.getTraineeId());
		try{
			if (existingTrainee != null){
				et.begin();
				existingTrainee.setFirstname(t.getFirstname());
				et.commit();
			}
		}
		finally{
			em.close();
		}
	}		

	//Retrieve a Trainee from the database
	public Trainee findTrainee(int id) { 
		Trainee t = new Trainee();
		EntityManager em = getEntityManager();
		try{
			t = em.find(Trainee.class, id);
		}
		finally{
			em.close();
		}
		return t;
	} 

	//Get a list of all trainees in the trainees_table using a NativeQuery
	public List<Trainee> findAllTrainees() {
		Query query = getEntityManager().createNativeQuery(
				"SELECT traineeId, username, first_name, last_name FROM trainee_table t", Trainee.class);
		return query.getResultList(); 
	} 
}
