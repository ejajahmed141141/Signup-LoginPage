package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login_Servlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		String name=req.getParameter("name");
		String password=req.getParameter("pass");
		
		
		PrintWriter p=res.getWriter();
		
		if(name.equals("admin")&& password.equals("admin"))
		{
			p.print("<h1>login successfully</h1>");
			req.getRequestDispatcher("socialmedia.html").include(req, res);
			
		}
		else {
			p.print("<h1>Invalid user id or pssword..............</h1>");
			req.getRequestDispatcher("login.html").include(req, res);
		}
		
	}

}
