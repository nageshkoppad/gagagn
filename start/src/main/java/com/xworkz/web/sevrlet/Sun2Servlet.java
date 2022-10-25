package com.xworkz.web.sevrlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=20,urlPatterns="/fire")
public class Sun2Servlet extends HttpServlet {
	
	public Sun2Servlet() {
		System.out.println("this is deafault const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running method");
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.append("<html><body bgcolor='black';>"+"<h1 style=\"color:white\">this is black</h1>").append("</body></head><html>");
	}
}
