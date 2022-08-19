package com.server.bike;

public class Cycle {
	public String brand;
	public String tyresBrand;
	public double cost;
	public String type = "gear";
	public int totalno;

	public Cycle(String brand, String tyresBrand, int totalno) {
		this.brand = brand;
		this.tyresBrand = tyresBrand;
		this.totalno = totalno;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void printData() {
		System.out.println("The Brand of cycle is " + this.brand);
		System.out.println("The tyresBrand of cycle is " + this.tyresBrand);
		System.out.println("The cost of cycle is " + this.cost);
		System.out.println("The type of cycle is " + this.type);
		System.out.println("The totalno of cycle is " + this.totalno);
	}
}
