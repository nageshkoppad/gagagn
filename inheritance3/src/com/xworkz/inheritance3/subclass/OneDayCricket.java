package com.xworkz.inheritance3.subclass;
import com.xworkz.inheritance3.baseclass.Cricket;
public class OneDayCricket extends Cricket{
public String bestBowler;
public String bestBatsmen;
	public OneDayCricket(String countryName, String captain, String gender,String bestBowler,String bestBatsmen) {
		super(countryName, captain, gender);
		this.bestBatsmen=bestBatsmen;
		this.bestBowler=bestBowler;
	}
	public String manOfSeries(String name) {
		return name;
	}
	@Override
	public double presentation(double price)
	{
	return price;	
	}
	@Override
	public boolean entertainment(boolean forFun)
	{
		return forFun;
	}
}
