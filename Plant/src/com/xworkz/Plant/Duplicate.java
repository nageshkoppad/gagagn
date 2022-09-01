package com.xworkz.Plant;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		 String myString = "121";
	      StringBuffer buffer = new StringBuffer(myString);
	      buffer.reverse();
	      System.out.println(buffer);
	      String data = buffer.toString();
   boolean  ok=myString.equals(data);
   if(ok=true) {
	System.out.println("it is  palindrome");   
   }
   else {
   System.out.println(ok);
	}
	}

}
