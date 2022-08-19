package com.sever.project6.subclass;
import com.sever.project6.baseclass.Plastic;
public class Pipe extends Plastic {
	public double size;
	public double lengthInMeters;
	public double price;

	public Pipe(String type,String color,boolean strong,double size,double lenghtInMeters,double price) {
		super(type,color,strong);
		this.size = size;
		this.lengthInMeters = lenghtInMeters;
		this.price = price; 
	}
	public Pipe(String type,String color,boolean strong) {
		super(type,color,strong);
	}
	
	public void torisu() {
		
		System.out.println(super.type);
		System.out.println(super.color);
		System.out.println(super.strong);
		System.out.println(this.size);
		System.out.println(this.lengthInMeters);
		System.out.println(this.price);


	}

}
