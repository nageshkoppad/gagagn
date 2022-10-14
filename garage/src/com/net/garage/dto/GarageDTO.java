package com.net.garage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GarageDTO {
	private int totalTools;
	private String garageName;
	private String ownerName;
	private int totalWorker;
	private int since;
	
	
}
