package SpringAOP;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.*;

import SpringAOP.ClassA;
import SpringAOP.ClassB;

public class SpringAOPMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Example.xml");
		ClassA a = (ClassA) ctx.getBean("cA");
		//ClassA a = new ClassA();
		ClassB b = (ClassB) ctx.getBean("cB");
		//ClassB b = new ClassB();
		
		a.method1();
		a.method1(10);
		b.method1();
		a.method2();
		b.method2();
		b.getInstance();
	}
}
