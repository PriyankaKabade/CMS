/**
 * 
 */
package com.org.loginform;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.ExpiresFilter.XHttpServletResponse;

/**
 * @author Piyu
 *
 */

public class loginServlet extends GenericServlet {

	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("You have entered in servlet");

		String username = servletRequest.getParameter("username");

		String password = servletRequest.getParameter("password");

		PrintWriter printWriter = servletResponse.getWriter();
		// printWriter.print("<html><body>");
		if (username.equals("admin")) {
			System.out.println("USer name is correct");

			RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("/Home.html");
			requestDispatcher.include(servletRequest, servletResponse);

			// printWriter.print("<h1>USer name is correct </h1> " + username);

		} else {

			// printWriter.print("USer name is not correct");
		}
		if (password.equals("admin")) {

			// printWriter.print("password is correct " + password);

		} else {

			// printWriter.print("password is not correct");

		}
		// printWriter.print("</html></body>");

	}

}
