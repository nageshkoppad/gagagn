package com.server.inheritance1.subclass;
import com.server.inheritance1.superclass.Father;
public class Son extends Father {
	String name;
	int age;
	String place;
	public Son(int age,String name,String place){
	super(age,name,place);	
	this.name=name;
	this.age=age;
	this.place=place;
	}
	public void disply1()
	{
		System.out.println("son name="+this.name);
		System.out.println("     age="+this.age);
		System.out.println("   place="+this.place);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("father name="+super.name);
		System.out.println("        age="+super.age);
		System.out.println("      place="+super.place);
		System.out.println("-------------------------------------------------------------------------------------------------");
	}

}
