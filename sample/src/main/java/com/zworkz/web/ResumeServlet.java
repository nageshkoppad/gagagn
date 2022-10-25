package com.zworkz.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns= "/life")
public class ResumeServlet extends HttpServlet {

  private ArrayList<JobDTO> dtos=new ArrayList<JobDTO>();
	public ResumeServlet() {
		
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name1=req.getParameter("name");
		String cap=req.getParameter("email");
		String save=req.getParameter("num");
		String save1=req.getParameter("num1");
		String name2=req.getParameter("gender");
		String name3=req.getParameter("one");
		String name4=req.getParameter("two");
		String name11=req.getParameter("huli");
		String name5=req.getParameter("three");
		String name6=req.getParameter("skills");
		String name16=req.getParameter("back");
		String name15=req.getParameter("num3");
		String name8=req.getParameter("man");
		String name7=req.getParameter("card");
	
		System.out.println("Name is:"+name1);
		System.out.println("Email is:"+cap);
		System.out.println("Phone no is:"+save);
		System.out.println("Alt phone no is:"+save1);
		System.out.println("Gender is:"+name2);
		System.out.println("Qualification is:"+name3);
		System.out.println("year of pass out:"+name4);
		System.out.println("Select the university:"+name11);
		System.out.println("present adress:"+name5);
		System.out.println("select skills:"+name6);
		System.out.println("Total experiance:"+name16);
		System.out.println("expected salary:"+name15);
		System.out.println("select id  proofs"+name8);
		System.out.println("id proof no is:"+name7);
		
		
	resp.setContentType("text/html");
	PrintWriter writer=resp.getWriter();
	writer.append("<html>")
	          .append("<body>")
	          .append("<h5>Registration is success, below is the details</h5>")
	          .append("<h3>")
	          .append("Name is: "+name1+"<br>")
	          .append("Email is: "+cap+"<br>")
	          .append("Phone no is: "+save+"<br>")
	          .append("Alt phone no is: "+save1+"<br>")
	          .append("Gender is: "+name2+"<br>")
	          .append("Qualification is: "+name3+"<br>")
	          .append("year of pass out: "+name4+"<br>")
	          .append("Select the university: "+name11+"<br>")
	          .append("present adress: "+name5+"<br>")
	          .append("select skills: "+name6+"<br>")
	          .append("Total experiance: "+name16+"<br>")
	          .append("expected salary: "+name15+"<br>")
	          .append("select id  proofs: "+name8+"<br>")
	          .append("id proof no is: "+name7+"<br>")
	          .append("<h3>")
	          .append("<body>")
	          .append("<html>");
	
	JobDTO dto=new JobDTO(name1,cap,save,save1,name2,name3,name4,name11,name5,name6,name16,name15,name8, name7);
	dtos.add(dto);
	
	System.out.println(dtos);
	}	
}
