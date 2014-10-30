package com.fdmgroup.example.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.*;

import com.fdmgroup.example.aop.UserFactory;
import com.fdmgroup.example.aop.User;

public class SpringAOPMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("Example.xml");
		
		UserFactory userFactory = (UserFactory) ctx.getBean("factory");
		User user 				= (User) ctx.getBean("user");
		

		user.work();
		//user.play();
		userFactory.operate(17);
		
		//userFactory.createUser();
		//user.play(6.0);
		
		((ConfigurableApplicationContext)ctx).close();
		
	}
}
