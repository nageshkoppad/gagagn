package com.net.comparator;

import java.util.List;
import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		HouseDTO houseDTO1 = new HouseDTO(2, "Brundavana", "Akash", Type.VILLA, 2, true, PropertyType.OWN, 2500.0);
		HouseDTO houseDTO2 = new HouseDTO(5, "Aadi", "Naveen", Type.APPARTMENT, 4, false, PropertyType.LEASE, 3000.0);
		HouseDTO houseDTO3 = new HouseDTO(4, "Surya ", "Shubash", Type.VILLA, 2, true, PropertyType.RENT, 2000.0);
		HouseDTO houseDTO4 = new HouseDTO(3, "Bhavani Runa", "Praveen", Type.INDIVIDUAL, 1, false, PropertyType.RENT, 1500.0);
		HouseDTO houseDTO5 = new HouseDTO(6, "Parimala nilaya", "Manju", Type.INDIVIDUAL, 1, false, PropertyType.RENT, 1500.0);
		HouseDTO houseDTO6 = new HouseDTO(1, "Eshwarakrupa", "Ravi", Type.VILLA, 2, true, PropertyType.RENT, 2550.0);
		HouseDTO houseDTO7 = new HouseDTO(7, "Adarsha", "Basu", Type.APPARTMENT, 5, false, PropertyType.RENT, 4500.0);
		HouseDTO houseDTO8 = new HouseDTO(8, "Aashirvada", "Chandru", Type.VILLA, 3, true, PropertyType.RENT, 2000.0);
		HouseDTO houseDTO9 = new HouseDTO(9, "Belaku", "Kiran", Type.INDIVIDUAL, 1, true, PropertyType.RENT, 1200.0);
		HouseDTO houseDTO10 = new HouseDTO(10, "Bhavani", "Sachin", Type.APPARTMENT, 8, false, PropertyType.LEASE, 3600.0);
		HouseDTO houseDTO11 = new HouseDTO(11, "Chaya", "pramod", Type.APPARTMENT, 15, false, PropertyType.LEASE, 3150.0);	
		List<HouseDTO> houseDTOs = new ArrayList<HouseDTO>();
		houseDTOs.add(houseDTO1);
		houseDTOs.add(houseDTO2);
		houseDTOs.add(houseDTO3);
		houseDTOs.add(houseDTO4);
		houseDTOs.add(houseDTO5);
		houseDTOs.add(houseDTO6);
		houseDTOs.add(houseDTO7);
		houseDTOs.add(houseDTO8);
		houseDTOs.add(houseDTO9);
		houseDTOs.add(houseDTO10);
		houseDTOs.add(houseDTO11);

		
		System.out.println("----------------------------asc by id----------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e1.getId().compareTo(e2.getId())).forEach((e)->System.out.println(e));
		System.out.println("----------------------------desc by id----------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).forEach((e)->System.out.println(e));
		System.out.println("----------------------------asc by name----------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach((e)->System.out.println(e));
		System.out.println("----------------------------desc by type----------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e2.getType().compareTo(e1.getType())).forEach((e)->System.out.println(e));
		System.out.println("----------------------------desc by sqft----------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e2.getSqft().compareTo(e1.getSqft())).forEach((e)->System.out.println(e));
		System.out.println("----------------------------with loan and desc by owner----------------------------------------");
		houseDTOs.stream().filter((e)->e.getLoan() == true)
		.sorted((e1,e2)->((e2.getOwner().compareTo(e1.getOwner())))).forEach((e)->System.out.println(e));
		System.out.println("----------------------------without loan and desc by owner----------------------------------------");
		houseDTOs.stream().filter((e)->e.getLoan() == false)
		.sorted((e1,e2)->((e2.getOwner().compareTo(e1.getOwner())))).forEach((e)->System.out.println(e));
		System.out.println("----------------------------owning type by lease----------------------------------------");
		houseDTOs.stream().filter((e)->e.getOwningType() == PropertyType.LEASE).forEach((e)->System.out.println(e));
		System.out.println("----------------------------type by appartment----------------------------------------");
		houseDTOs.stream().filter((e)->e.getType() == Type.APPARTMENT).forEach((e)->System.out.println(e));
		System.out.println("----------------------------type by villa----------------------------------------");
		houseDTOs.stream().filter((e)->e.getType() == Type.VILLA).forEach((e)->System.out.println(e));
		System.out.println("----------------------------order by type and asc by owningtype----------------------------------------");
		houseDTOs.stream().sorted((r,r2)->{
		int m=	r.getType().compareTo(r2.getType());
		if(m==0) {
		return	r.getOwningType().compareTo(r2.getOwningType());
			
		}	
		return m;		
		}).forEach((ref)->System.out.println(ref));
		System.out.println("--------------------------order by name and desc by id------------------------------------------");
		houseDTOs.stream().sorted((r,r2)->{
			int m=	r2.getName().compareTo(r.getName());
			if(m==0) {
			return	r2.getId().compareTo(r.getId());
				
			}	
			return m;		
			}).forEach((ref)->System.out.println(ref));

	}

}
