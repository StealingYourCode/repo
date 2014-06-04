package com.fdmgroup.example.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class HatFilter
 */

public class HatFilter implements Filter {

    /**
     * Default constructor. 
     */
    public HatFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, 
				ServletResponse response, 
				FilterChain chain) throws IOException, 
										ServletException {
		// place your code here
		System.out.println("Taking off hat...");
		
		String welcome = "welcome glass of champagne";
		request.setAttribute("welcomeItem", welcome);
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		System.out.println("Putting hat back on...");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
