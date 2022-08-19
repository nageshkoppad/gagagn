package com.server.project3.subclass;
import com.server.project3.baseclass.Fruit;

public class Mango extends Fruit{
	public double quantity;
	public double price;
	public boolean sweet;
	
	public Mango(String name,String color,String shape,double quantity,double price,boolean sweet) {
		super(name,color,shape);
		this.quantity = quantity;
		this.price = price;
		this.sweet = sweet;
	}
	public Mango(String name,String color,String shape) {
		super(name,color,shape);
	}
	public void torisu() {
		
		System.out.println(super.name);
		System.out.println(super.color);
		System.out.println(super.shape);
		System.out.println(this.quantity);
		System.out.println(this.price);
		System.out.println(this.sweet);
		
	}


}
