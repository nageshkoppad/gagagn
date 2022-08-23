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
		
		
	}
	public String getCountryName()
	{
		return super.countryName;
	}
	@Override
	public double presentation(double price)
	{
	return price;	
	}
	
}
