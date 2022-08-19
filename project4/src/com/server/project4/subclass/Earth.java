package com.server.project4.subclass;
import com.server.project4.baseclass.Planet;
public class Earth extends Planet{
	public boolean habitant;
	public double disFromSun;
	public int noOfContinent;
	
	public Earth(String name,int orbit,double radius,boolean habitant,double disFromSun,int noOfContinet) {
		super(name,orbit,radius);
		this.habitant = habitant;
		this.disFromSun = disFromSun;
		this.noOfContinent = noOfContinet;
	}
	public Earth(String name,int orbit,double radius) {
		super(name,orbit,radius);
	}
	public void torisu() {
		
		System.out.println(this.habitant);
		System.out.println(this.disFromSun);
		System.out.println(this.noOfContinent);
		System.out.println(super.name);
		System.out.println(super.orbit);
		System.out.println(super.radius);

	}
}
