package com.net.unchecked;

public class IndexOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] store=new int[1];
		store[0]=1;
		store[1]=2;
		store[2]=3;
		
		System.out.println(store[0]);
	}

}
