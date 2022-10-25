package com.net.projector.dto;

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
public class ProjectorDTO {
   private String brand;
   private int  rate;
   private String usedTo;
   private int noPosrts;
}
