package com.xworkz.inheritance3;

import com.xworkz.inheritance3.subclass.OneDayCricket;
import com.xworkz.inheritance3.subclass.T20Cricket;
import com.xworkz.inheritance3.subclass.TestCricket;

public class SubClassRunner {

	public static void main(String[] args) {
		TestCricket test=new TestCricket("india","kohli","male","red");
		test.getCountryName();
		System.out.println(test.entertainment(true));
		test.presentation(1000000000d);
		System.out.println(test.presentation(1000000000d));
		
		OneDayCricket oneDay=new OneDayCricket("india","dhavana","male","suryakumar yada","bumra");
		oneDay.entertainment(true);
		System.out.println(oneDay.entertainment(true));
		oneDay.presentation(1000000000d);
		System.out.println(oneDay.presentation(1000000000d));
		
		T20Cricket t20=new T20Cricket("india", "rohit sharama","male");
		t20.entertainment(true);
		System.out.println(t20.entertainment(true));
		t20.presentation(1000000000d);
		System.out.println(t20.presentation(1000000000d));
		

	}

}
