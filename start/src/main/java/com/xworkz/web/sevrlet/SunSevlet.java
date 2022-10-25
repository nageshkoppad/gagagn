package com.xworkz.web.sevrlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup=10,urlPatterns="/water")
public class SunSevlet extends HttpServlet {
  
	public SunSevlet() {
		System.out.println("this is default constr");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running service is servlet");
    resp.setContentType("text/html");
    PrintWriter writer=resp.getWriter();
    writer.append("<html> <body bgcolor='green';><h1>this is green</h1></body></html>");
	}
}
