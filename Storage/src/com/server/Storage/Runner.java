package com.server.Storage;

import com.server.Storage.postpaid.Postpaid;
import com.server.Storage.prepaid.Prepaid;
import com.server.Storage.sim.Sim;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sim sim=new Postpaid();
		sim.price();
		sim.timing();
		
		Sim sim1=new Prepaid();
		sim1.price();
		sim1.timing();
		
	}

}
