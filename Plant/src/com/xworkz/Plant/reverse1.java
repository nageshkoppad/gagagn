package com.xworkz.Plant;

public class reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello world good morning";
		  String name = "";

		  for (int i = str.length() - 1; i >= 0; --i) {
		   name += str.charAt(i);     
		  }

		  System.out.println(name);
    
	}

}
