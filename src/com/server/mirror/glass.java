package com.server.mirror;

public class glass {
	public String brand;
	public String shape;
	public int size;
	public String frametype;
	public String mType = "Concave";

	public glass(String brand, String shape, int size) {
		System.out.println("Constructor with argsuments");
		this.brand = brand;
		this.shape = shape;
		this.size = size;
	}

	public void setFrametype(String frametype) {
		this.frametype = frametype;
	}

	public void printData() {
		System.out.println(this.brand);
		System.out.println(this.shape);
		System.out.println(this.size);
		System.out.println(this.frametype);
		System.out.println(this.mType);
	}

}
