package com.net.garage.runner;

import com.net.garage.dto.GarageDTO;
import com.net.garage.service.GarageServiceImpl;

public class Runner {

	public static void main(String[] args) {
	
		GarageDTO dto=new GarageDTO(1000,"vinayak","vinay",2021,2500);
		GarageServiceImpl store=new GarageServiceImpl();
		store.validateAndSave(dto);
	}

}
