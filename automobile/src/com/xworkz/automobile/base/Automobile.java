package com.xworkz.automobile.base;

public class Automobile {
	 String type;
		public String brand;

		public double sellAccessories(String name) {

			if (name == "clutch cable") {
				System.out.println("The price of clutch cable is : " + " ----- Automobile class");
				return 400;
			}

			if (name == "bike stand") {
				System.out.println("The price of bike stand is : " + " ----- Automobile class");
				return 180;
			}

			if (name == "car wipers") {
				System.out.println("The price of the car wipers are : " + " ----- Automobile class");
				return 1000;
			}

			System.out.println("No items " + " ----- Automobile class");
			return 0.0;
		}

		protected Automobile() {
			System.out.println("Default constructor" + " ----- Automobile class");
		}

		public void setType(String type) {
			this.type = type;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		protected int torisu(int value) {
			System.out.println(type + "------ Automobile class");
			System.out.println(brand + "------ Automobile class");
			return 12;
		}
}
