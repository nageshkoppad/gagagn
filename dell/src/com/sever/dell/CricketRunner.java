package com.sever.dell;

import com.sever.dell.base.CricketDto;

public class CricketRunner {

	public static void main(String[] args) {

		CricketDto cricket = new CricketDto("india", 11, "rohit", "mumbai", "rahul", true, 25);

		System.out.println(cricket);

		CricketDto crick = new CricketDto();
		crick.setCaptain("kohli");
        crick.setCountry("karnataka");
        crick.setNoWins(22);
        crick.setNoPlayer(11);
        crick.setPlace("gokak");
        crick.setViceCaptin("nagesh");
        
		System.out.println(crick.getCaptain());
		System.out.println(crick.getCountry());
		System.out.println(crick.getNoWins());
		System.out.println(crick.getNoPlayer());
		System.out.println(crick.getPlace());
		System.out.println(crick.getViceCaptin());
	}

}
