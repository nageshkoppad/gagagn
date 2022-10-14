package com.net.garden.dto;

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

public class GardenDTO {
 private int totalTrees;
 private String gardenName;
 private String watchmenName;
 private int totalArea;
}
