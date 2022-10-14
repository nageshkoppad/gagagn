package com.net.garage.service.repository;

import com.net.garage.dto.GarageDTO;

public interface GarageRepository {
	boolean save(GarageDTO dto);
}
