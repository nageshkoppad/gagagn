package com.server.Storage.prepaid;

import com.server.Storage.sim.Sim;

public class Prepaid extends Sim {

	@Override
	public double price() {
		
		return 250d;
	}

	@Override
	public double timing() {
		return 4d;
	}

}
