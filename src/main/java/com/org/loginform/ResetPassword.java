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
public class ResetPassword extends GenericServlet

{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		
		String oldPassword;
		String newPassword;
		String confirmPassword;
		
		oldPassword= req.getParameter("oldPassword");
		newPassword= req.getParameter("newPassword");
		confirmPassword= req.getParameter("confirmPassword");
		
		PrintWriter printWriter = res.getWriter();
		
		
		if(oldPassword.equals("admin")) {
			
			printWriter.print("Correct password entered");
						
			
		}else  {
			printWriter.print("Incorrect old password entered");
		}
		
		if(newPassword.equals(confirmPassword)){
			
			printWriter.print("Password changed");
		}
		else {
			
			printWriter.print("Entered new Passwords are not same");
		}
		
		
		
	}

}
