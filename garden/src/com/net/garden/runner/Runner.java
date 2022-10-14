package com.net.garden.runner;

import com.net.garden.dto.GardenDTO;
import com.net.garden.service.GardenSeviceImpl;

public class Runner {

	public static void main(String[] args) {

		GardenDTO dto=new GardenDTO(1000,"brundavana","krishna",6001);
        GardenSeviceImpl save=new GardenSeviceImpl();
        save.validateAndSave(dto);
	}

}
