package com.fdmgroup.example.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

import com.fdmgroup.example.aop.First;
import com.fdmgroup.example.aop.Second;

public class SpringAOPMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("Example.xml");
		
		First first = (First) ctx.getBean("first");
		Second second = (Second) ctx.getBean("second");

		
		first.methodA();
//		first.methodB(10);
//		first.methodB();

//		second.methodA();
		
//		second.methodB();
		
//		first.getSecondInstance();
//		second.getInstance();
		
	}
}
