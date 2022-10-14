package com.net.garden.service;

import com.net.garden.dto.GardenDTO;
import com.net.garden.repository.GardenRepositoryImpl;


public class GardenSeviceImpl implements GardenService {

	@Override
	public boolean validateAndSave(GardenDTO dto) {
		
		int id=dto.getTotalTrees();
	     String name=dto.getGardenName();
	    String founder= dto.getWatchmenName();
	    int since=dto.getTotalArea();
	     if(id>0 && id<50000) {
	    	 System.out.println("looks valid");
	    	 if(name!=null && name.length()>3 && name.length()<50  && !name.contains("@") && !name.contains("#")) {
	    		 System.out.println("looks valid");
	    		 if(founder!=null && founder.length()>6 && founder.length()<50 && !founder.contains("@") && !founder.contains("#") ) { 
	    			 System.out.println("looks valid ");
	    			 if(since>5000 && since<10000) {
	    				 System.out.println("looks all valid");
	    				 GardenRepositoryImpl impl=new GardenRepositoryImpl();
	    				 impl.save(dto);
	    				 System.out.println(dto);
	    				 }else {
	    					 System.err.println("invalid");
	    				 }
	    			 }else {
	    				 System.err.println("invalid");
	    			 }
	    		 }else {
	    			 System.err.println("invalid");
	    		 }
	    	 }else {
	    		 System.err.println("invalid");
	    	 }
		return false;
	}

}
