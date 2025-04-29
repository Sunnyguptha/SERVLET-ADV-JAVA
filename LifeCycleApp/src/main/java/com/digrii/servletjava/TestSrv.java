package com.digrii.servletjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestSrv extends HttpServlet{

	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("init-method");
	}
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		PrintWriter pw=res.getWriter();
		
		System.out.println("service method called..");
		
		pw.println("<center><h1>This is service method</h1></center>");
		
		pw.close();
	}
	
	public void destroy() {
		System.out.println("destroy method called");
	}
	
	
}
