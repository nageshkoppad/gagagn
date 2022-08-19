package com.server.beer;

public class Alcohol {
	public String type;
	public String brand;// kingfisher
	public float alcohalContent = 5;
	public int cost;
	public int quantity;

	public Alcohol(String type, String brand, int quantity) {
		this.type = type;
		this.brand = brand;
		this.quantity = quantity;
		System.out.println("Constructor with args");
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void printData() {
		System.out.println(this.type);
		System.out.println(this.brand);
		System.out.println(this.alcohalContent);
		System.out.println(this.cost);
		System.out.println(this.quantity);
	}

}
