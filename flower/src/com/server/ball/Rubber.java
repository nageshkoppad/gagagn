package com.server.ball;

public class Rubber {
	public String from;
	public String treeName;
	public String brand;
	public String color;
	public double weigth = 163;

	public Rubber(String from, String treeName, String color) {
		System.out.println("Constructor with args");
		System.err.println("Constructor with args");
		this.from = from;
		this.treeName = treeName;
		this.color = color;
	
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void printData() {
		System.out.println(this.from);
		System.out.println(this.treeName);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.weigth);
	}

}
