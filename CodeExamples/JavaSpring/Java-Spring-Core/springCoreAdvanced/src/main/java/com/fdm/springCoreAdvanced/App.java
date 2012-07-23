package com.fdm.springCoreAdvanced;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	BasicConfigurator.configure();
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    }
}
