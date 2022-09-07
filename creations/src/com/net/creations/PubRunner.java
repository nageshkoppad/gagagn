package com.net.creations;

import com.net.creations.rules.PubRule;
import com.net.creations.rules.checker.DownTownPub;
import com.net.creations.rules.follower.CustomerRules;

public class PubRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PubRule rule=new CustomerRules();
		DownTownPub downTownPub=new DownTownPub(rule);
		downTownPub.checkRules();
		System.out.println(downTownPub.checkRules());
	}

}
