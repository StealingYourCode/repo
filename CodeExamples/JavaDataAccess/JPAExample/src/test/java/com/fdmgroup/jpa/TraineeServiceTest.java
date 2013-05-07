package com.fdmgroup.jpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.BasicConfigurator;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.JPAExample.Trainee;
import com.fdmgroup.JPAExample.TraineeService;

public class TraineeServiceTest {

	private static TraineeService ts;
	private Trainee t;
	private Trainee t2;
	
	@BeforeClass
	public static void setupClass(){
		//Set up logging
		BasicConfigurator.configure();
		/*Create an EntityManagerFactory and inject it into TraineeService
		  Note EntityManagerFactory objects are computationally expensive to create and
		  can be re-used, so only need to be created once. They can be created as a bean in Spring.
		  You must request the Factory with the same name as that defined in persistence.xml*/
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceunit");
		ts = new TraineeService(emf);
	}
	
	@Before
	public void setup(){
		t = new Trainee();
		t.setTraineeId(0);
		t.setUsername("john.smith");
		t.setFirstname("John");
		t.setLastname("Smith");
	}
	
	@Test
	public void testTraineeServicePersistTraineeMethodWritesAPassedTraineeToTheDatabase() {
		ts.persistTrainee(t);
		t2 = ts.findTrainee(0);
		assertEquals(t.getUsername(), t2.getUsername());
	}
	
	@Test
	public void testTraineeServiceUpdateTraineeAltersTheUserDetailsOfAnExistingTrainee(){
		String newFirstName = "Dan";
		t.setFirstname(newFirstName);
		ts.updateTraineeFirstName(t);
		t2 = ts.findTrainee(0);
		assertEquals(newFirstName, t2.getFirstname());
	}
	
	@Test
	public void testTraineeServiceRemoveTraineeRemovesATraineeFromTheDatabase(){
		ts.removeTrainee(t.getTraineeId());
		t2 = ts.findTrainee(t.getTraineeId());
		assertNull(t2);
	}
	
	@Test
	public void testTraineeServiceFindAllTraineesReturnsAListOfAllTraineesInTheDatabase(){
		ts.persistTrainee(t);
		Trainee t2 = new Trainee();
		t2.setTraineeId(1);
		t2.setFirstname("Bill");
		ts.persistTrainee(t2);
		List<Trainee> tl= ts.findAllTrainees();
		for(Trainee trainee: tl){
			System.out.println(trainee.getFirstname());			
		}
		
	}

}
