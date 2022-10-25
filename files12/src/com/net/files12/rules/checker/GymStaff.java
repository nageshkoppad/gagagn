package com.net.files12.rules.checker;

import com.net.files12.rules.GymRules;

public class GymStaff {
	private GymRules gymRules;

	public GymStaff(GymRules gymRules) {
		this.gymRules = gymRules;
	}

	public void checker() {
		boolean uniSex = this.gymRules.uniSex();
		double entryFee = this.gymRules.monthlyFees();
		boolean wearShoe = this.gymRules.wearShoes();

		if (entryFee == 200 && wearShoe && uniSex) {
			System.out.println("gym rules are following");
		} else {
			System.err.println("gym rules are not following");
		}
	}

}
