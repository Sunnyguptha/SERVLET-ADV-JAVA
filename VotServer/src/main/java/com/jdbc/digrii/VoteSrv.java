package com.jdbc.digrii;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoteSrv extends HttpServlet 
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		//read form data
		String name=req.getParameter("t1");
		String sage=req.getParameter("t2");
		
		//converting string age to int age
		int age=Integer.parseInt(sage);
		
		if(age<18)
			pw.println("<center><h1><font color='red'>"+name+" U r not eligible to vote</font></h1></center>");
		else
			pw.println("<center><h1><font color='green'>"+name+" U r eligible to vote</font></h1></center>");
	
		pw.close();
	}
}
