/**
 * 
 */
package com.org.loginform;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author Piyu
 *
 */
public class LoginFilterDemo implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		String priyanka = request.getParameter("username");
		
		if (priyanka.length() == 5) {
			
			System.out.println("Length is correct");
			
			chain.doFilter(request, response);
		}
		else {
			
			System.out.println("Length is not matching");
		}
		
	}
	
	

}
