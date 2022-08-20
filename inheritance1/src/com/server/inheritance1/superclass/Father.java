package com.server.inheritance1.superclass;
import com.server.inheritance1.baseclass.Chacha;
public class Father extends Chacha {
	public String name="shiva";
	public int age=40;
	public String place="beng";
	public Father(String name,int age,String place){
		super("gagan",65,"beng");
	}
	public Father(int age1,String name1,String place1)
	{
		super();
	}
	public void display()
	{
		System.out.println("chacha name="+super.name);
		System.out.println("        age="+ super.age);
		System.out.println("      place="+super.place);
	}
		
	

}
