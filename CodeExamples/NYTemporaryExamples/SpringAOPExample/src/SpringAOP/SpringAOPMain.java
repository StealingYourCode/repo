package SpringAOP;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.*;

import SpringAOP.ClassA;
import SpringAOP.ClassB;

public class SpringAOPMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("Example.xml");
		
		ClassA a = (ClassA) ctx.getBean("cA");
		ClassB b = (ClassB) ctx.getBean("cB");

		
//		a.method1();
//		a.method2(10);
//		a.method2();

		
//		b.method1();
//		b.method2();
		
//		a.getBInstance();
		b.getInstance();
		
	}
}
