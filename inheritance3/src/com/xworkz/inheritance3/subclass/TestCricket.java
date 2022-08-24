package com.xworkz.inheritance3.subclass;
import com.xworkz.inheritance3.baseclass.Cricket;
public class TestCricket extends Cricket {
	public String groundType;
	public TestCricket(String countryName,String captain,String gender,String groundType)
	{
		super(countryName,captain,gender);
		this.groundType=groundType;
	}
	public void setCountryName(String countryName)
	{
		this.countryName=countryName;
		
	}
	public String getCountryName()
	{
		return countryName;
	}
	@Override
	public double presentation(double price)
	{
	return price;	
	}
	
}
