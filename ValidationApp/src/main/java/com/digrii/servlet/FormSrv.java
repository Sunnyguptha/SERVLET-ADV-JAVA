package com.digrii.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormSrv extends HttpServlet 
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		//reading form data
		String name=req.getParameter("t1");
		String sage=req.getParameter("t2");
		int age=Integer.parseInt(sage);

		//String status=req.getParameter("vflag");
		//int age=0;
		

	if(age<18)

	pw.println("<center><h1>U r not eligible to vote</center>");

else
	pw.println("<center><h1>U r not eligible to vote</center>");

pw.close();


}
}
