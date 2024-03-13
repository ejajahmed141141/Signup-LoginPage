package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.dao.SignupDao;
import com.dto.Signupdto;

public class Signup_Servlet extends GenericServlet {


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
	String name=req.getParameter("name");	
	String email=req.getParameter("email");
	String pass=req.getParameter("pass");
	String phone=req.getParameter("phone");
	String gen=req.getParameter("gen");
	
	Signupdto signup= new Signupdto();
	signup.setName(name);
	signup.setEmail(email);
	signup.setPassword(pass);
	signup.setGen(gen);
	
	SignupDao dao=new SignupDao();
	dao.save(signup);
	
	PrintWriter p= res.getWriter();
	p.print("<h1>Signup sucessfully</h1>");
	
	RequestDispatcher r=req.getRequestDispatcher("login.html");
	r.include(req, res);
	
	
	}
}
