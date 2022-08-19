package com.server.helicopter;

public class Plane {
	public String name;
	public int noOfWing;
	public double weight;
	public int seat;
	public String owner = "Samual";

	public Plane(String name, int noOfWing, int seat) {
		this.name = name;
		this.noOfWing = noOfWing;
		this.seat = seat;
		System.out.println("Constrctor with Arguments");
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void printData() {
		System.out.println(this.name);
		System.out.println(this.noOfWing);
		System.out.println(this.weight);
		System.out.println(this.seat);
		System.out.println(this.owner);
	}

}
