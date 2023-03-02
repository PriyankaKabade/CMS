/**
 * 
 */
package com.org.loginform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author Piyu
 *
 */
public class StudentRegistration extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {


		PrintWriter printWriter = res.getWriter();
		
		
		String firstname,middlename,lastname,phone,address,email;
		
		firstname= req.getParameter("firstname");
		middlename= req.getParameter("middlename");
		lastname= req.getParameter("lastname");
		phone= req.getParameter("phone");
		address= req.getParameter("address");
		email= req.getParameter("email");
		System.out.println(middlename);
		printWriter.print(middlename);
		
		
	}
	
	

}
