package com.digri.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TableSrv extends GenericServlet {

	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		
		PrintWriter pw=res.getWriter();
		
		res.setContentType("text/html");
		
		pw.println("<table border='1' bgcolor='red'>");
		pw.println("<thead>");
		pw.println("<tr><th>SNO</th><th>SNAME</th><th>SADD</th></tr>");
		
		pw.println("<tbody>");
		pw.println("<tr><td>101</td><td>ganesh</td><td>Hyderabad</td></tr>");
		pw.println("<tr><td>102</td><td>shiva</td><td>Kazipat</td></tr>");
		pw.println("</tbody>");
		
		pw.println("</thead>");
		pw.println("</table>");
	}

}
