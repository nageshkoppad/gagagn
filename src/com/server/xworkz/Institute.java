package com.server.xworkz;

public class Institute {
	public String name;
	public String area;
	public String lang;
	public int cost;
	public double entryTime = 9.00;

	public Institute(String name, String area, String lang) {
		this.name = name;
		this.area = area;
		this.lang = lang;
		System.out.println("Constructor with argsuments");
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void printData() {
		System.out.println(this.name);
		System.out.println(this.area);
		System.out.println(this.lang);
		System.out.println(this.cost);
		System.out.println(this.entryTime);
	}

}
