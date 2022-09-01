package com.xworkz.automobile.display;
import com.xworkz.automobile.base.Automobile;
import com.xworkz.automobile.base.HondaAutomobile;
import com.xworkz.automobile.sub.TataAutomobile;

public class AutomobileDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HondaAutomobile au = new HondaAutomobile();
		double s = au.sellAccessories(null);
		System.out.println(s);
		au.setBrand("Honda");
		au.setType("Accessories");

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

		HondaAutomobile auto = new HondaAutomobile();
		double a = auto.sellAccessories("clutch cable");
		System.out.println(a);
		auto.setTime(10.30d, 7.30d);
		au.setBrand("Hero");
		au.setType("spares");
		auto.torisu(0);

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

		TataAutomobile tata = new TataAutomobile();
		tata.setBrand("Hero");
		tata.setType("spares");
		tata.torisu();
	}

}
