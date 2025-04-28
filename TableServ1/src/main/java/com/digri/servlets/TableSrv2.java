package com.digri.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TableSrv2 extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
		
		PrintWriter pw=res.getWriter();
		
		res.setContentType("application/ms-word");
		pw.println("<table>");
		pw.println("<thead>");
		pw.println("<tr><th>SNO</th><th>SNAME</th><th>ADD</th></tr>");
		pw.println("</thead>");
		
		pw.println("</table>");
		
	}
}
