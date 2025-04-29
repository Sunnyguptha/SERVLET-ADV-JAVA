package com.digrii.servletJava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	public void init(FilterConfig config)
	{
		
	}
	
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain) throws IOException, ServletException {
		
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		pw.println("<center><h1>Filter Called Before</h1></center>");
		
		
		pw.println("<center><h1>Filter called after</h1></center>");
		
		
	}
	
	public void destroy() {
		
	}
	
		
	

		
}
