package com.net.garden.repository;

import com.net.garden.dto.GardenDTO;

public interface GardenRepository {
	boolean save(GardenDTO  dto);
}
