package com.xworkz.inheritance3.subclass;
import com.xworkz.inheritance3.baseclass.Cricket;
public class T20Cricket extends Cricket{
	public T20Cricket(String countryName, String captain, String gender) {
		super(countryName,captain,gender);
	}

	public String manOfTheMatch(String playerName)
	{
		return playerName;
	}

}
