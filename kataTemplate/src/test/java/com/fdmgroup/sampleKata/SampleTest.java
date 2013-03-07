package com.fdmgroup.sampleKata;

//Junit
import static org.junit.Assert.*;
import org.junit.*;

//Mockito
import static org.mockito.Mockito.*;

//Log4j
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

//Import package containing code to be tested
import com.fdmgroup.sampleKata.SampleClass;


public class SampleTest {

	Logger log = Logger.getLogger(SampleTest.class);
	SampleClass sc;
	
	@BeforeClass
	public static void first(){
		//Set up log4j if needed
		BasicConfigurator.configure();
	}
	
	@Before
	public void setup(){
		//Initialise any test wide variables/objects here
		sc = new SampleClass();
	}
	
	@Test
	public void testSampleClassExampleMethodReturnsTrue() {
		log.info("Running sample test...");
		boolean success = sc.example();
		assertTrue(success);
	}

}
