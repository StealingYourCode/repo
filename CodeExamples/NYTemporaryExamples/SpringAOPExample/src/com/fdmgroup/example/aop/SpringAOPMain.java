package com.fdmgroup.example.aop;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

import com.fdmgroup.example.aop.ClassA;
import com.fdmgroup.example.aop.ClassB;

public class SpringAOPMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("Example.xml");
		
		ClassA a = (ClassA) ctx.getBean("cA");
		ClassB b = (ClassB) ctx.getBean("cB");
		
		a.method1();
		
		
		//a.method2(2345677);
		//a.method2();

//		b.method1();
		
//		b.method2();
		
//		a.getBInstance();
//		try {
//			b.getInstance();
//		} catch (IOException e) {
//			System.out.println("Not printing the stack trace in main().");
//		}
		
	}
}
