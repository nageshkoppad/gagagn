package com.net.garage.service;

import com.net.garage.dto.GarageDTO;

public interface GarageService {
	boolean validateAndSave(GarageDTO dto);
}
