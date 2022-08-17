package com.server.bat;

public class Wooden {
	public String from;
	public String plantname;
	public int length;
	public String color="gold";
	public String usedFor;
	
	public Wooden(String from,String plantname,String usedFor)
	{
		System.out.println("Constructor with arguments");
		this.from=from;
		this.plantname=plantname;
		this.usedFor=usedFor;
	}
	public void setLength(int length)
	{
		this.length=length;
	}
	public void printData()
	{
		System.out.println(this.from);
		System.out.println(this.plantname);
		System.out.println(this.length);
		System.out.println(this.color);
		System.out.println(this.usedFor);
	}

}
