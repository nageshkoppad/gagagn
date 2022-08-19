package com.server.network;

public class Browser {
	public String name;
	public String company;
	public int size;
	public String type = "Android";
	public String useage;

	public Browser(String name, String company, int size) {
		this.name = name;
		this.company = company;
		this.size = size;
		System.out.println("Constructors with arguments");
	}

	public void setUseage(String useage) {
		this.useage = useage;
	}

	public void printData() {
		System.out.println("The Browser name is " + this.name);
		System.out.println("The Browser is belongs to" + this.company);
		System.out.println("The Browser size is " + this.size);
		System.out.println("The Browser type is" + this.type);
		System.out.println("The Browser useage is in " + this.useage);
	}

}
