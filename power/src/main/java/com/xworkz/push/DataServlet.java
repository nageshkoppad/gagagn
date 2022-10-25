package com.xworkz.push;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns = "/switch")

public class DataServlet extends HttpServlet {
	
	public DataServlet() {
		System.out.println("we running DataServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service method");
		String name=req.getParameter("name");
		String company1=req.getParameter("offer");
		String salary1=req.getParameter("salary");
		
		System.out.println("name"+" "+name);          //for printing on console
		System.out.println("company"+" "+company1);
		System.out.println("salary"+" "+salary1);
		  
		resp.setContentType("text/html");        //for printing on web page
		PrintWriter writer=resp.getWriter();
		writer.append("<html>")
		 .append("<body>")
		 .append("<h1>")
		 .append("name"+" "+name+"<br>")
		 .append("company"+" "+company1+"<br>")
		 .append("salary"+" "+salary1+"<br>")
		 .append("<h1>")
		 .append("<body>")
		 .append("<html>");	 
	}
}
