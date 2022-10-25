package com.xworkz.web.sevrlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=15,urlPatterns="/hot")
public class Sun1Servlet extends HttpServlet {
     public  Sun1Servlet() {
    	 System.out.println("this is default conts");
     }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running method");
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.append("<body bgcolor='yellow'>").append("<h style=color:pink;font-size:600%;>this is yellow</h>").append("</body>");
	}    
}
