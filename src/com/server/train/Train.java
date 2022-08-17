package com.server.train;

public class Train {
	public String name;
	public int totalStop;
	public String startFrom = "Nagasandra";
	public String endStop;
	public String payType;

	public Train(String name, int totalStop, String payType) {
		this.name = name;
		this.totalStop = totalStop;
		this.payType = payType;
		System.out.println("Constrcutor with Arguments");
	}

	public void setEndStop(String endStop) {
		this.endStop = endStop;
	}

	public void printData() {
		System.out.println("The Train name is" + this.name);
		System.out.println("The Train name is" + this.totalStop);
		System.out.println("The Train name is" + this.startFrom);
		System.out.println("The Train name is" + this.endStop);
		System.out.println("The Train name is" + this.payType);
	}
}
