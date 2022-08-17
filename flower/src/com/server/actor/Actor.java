package com.server.actor;

public class Actor {
	public String name;
	public String belongs;
	public String recentMovie = "Vikranth rona";
	public double height;
	public int remundation;

	public Actor(String name, String belongs,int remundation) {
		this.name = name;
		this.belongs = belongs;
		this.remundation = remundation;
		System.out.println("Constroctor with args");
	}

	public void setHeight(double height)
	{
		this.height=height;
	}

	public void printData() {
		System.out.println(this.name);
		System.out.println(this.belongs);
		System.out.println(this.recentMovie);
		System.out.println(this.height);
		System.out.println(this.remundation);
	}
}
