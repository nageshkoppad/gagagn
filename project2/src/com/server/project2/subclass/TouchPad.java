package com.server.project2.subclass;
import com.server.project2.baseclass.KeyBoard;

public class TouchPad extends KeyBoard{
public int price1;
public String uses;
public boolean worksGood;
public TouchPad() {
	super();
}

public void torisu1()
{
	System.out.println("----------------------------------------------------------------");
	System.out.println(price1);
	System.out.println(uses);
	System.out.println(worksGood);
	System.out.println(super.totalAlph);
	System.out.println(super.price);
	System.out.println(super.totalKeys);
}
 public TouchPad(int totalKeys,int price1)
{
	super(totalKeys);
	this.price=price;
	
}
 public void torisu2()
 {
	 System.out.println("-----------------------------------------------------------------");
	 System.out.println(price1);
		System.out.println(uses);
		System.out.println(worksGood);
		System.out.println(super.totalAlph);
		System.out.println(super.price);
		System.out.println(super.totalKeys); 
 }
 
 public TouchPad(int totalKeys,int totalAlph,String uses)
 {
	 super(totalKeys,totalAlph);
	 this.uses=uses;
 }
 public void torisu3()
 {
	 System.out.println("--------------------------------------------------------------------");
	    System.out.println(price1);
		System.out.println(uses);
		System.out.println(worksGood);
		System.out.println(super.totalAlph);
		System.out.println(super.price);
		System.out.println(super.totalKeys); 
 }

}
