package com.xworkz.Plant;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String myString = "anna";
	      StringBuffer buffer = new StringBuffer(myString);
	      buffer.reverse();
	      String data = buffer.toString();
	      if(myString.equals(data)){
	         System.out.println("Given String is palindrome");
	      } else {
	         System.out.println("Given String is not palindrome");
	      }
	}

}
