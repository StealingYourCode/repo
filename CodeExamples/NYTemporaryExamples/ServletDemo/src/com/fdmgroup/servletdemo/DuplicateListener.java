package com.fdmgroup.servletdemo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class DuplicateListener
 *
 */
public class DuplicateListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public DuplicateListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("Duplicate initialization message");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("Duplicate destruction message");
    }
	
}
