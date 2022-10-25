package com.net.files12;

import com.net.files12.follower.NageshFollower;
import com.net.files12.rules.GymRules;
import com.net.files12.rules.checker.GymStaff;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	GymRules gymRules=(GymRules) new NageshFollower();	
      GymStaff gymStaff=new GymStaff(gymRules);
      gymStaff.checker();
	}

}
