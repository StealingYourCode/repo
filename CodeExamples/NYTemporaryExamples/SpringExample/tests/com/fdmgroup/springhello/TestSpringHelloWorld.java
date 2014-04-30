package com.fdmgroup.springhello;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

public class TestSpringHelloWorld extends TestCase
{
	SpringHelloWorld hello;
	
	@Test
	public void testGetGreeting()
	{
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("HelloWorldBean.xml");

		
	    hello = (SpringHelloWorld) context.getBean("springHelloSetter");
		assertEquals(hello.getGreeting(),"Hello World!");
		
		hello = (SpringHelloWorld) context.getBean("springHello");
		assertNull(hello.getGreeting());
		
		hello = (SpringHelloWorld) context.getBean("springHelloConstructor");
		assertEquals(hello.getGreeting(),"Hello Constructor!");
	
		((ConfigurableApplicationContext)context).close();		
	}
}
