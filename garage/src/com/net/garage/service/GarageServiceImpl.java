package com.net.garage.service;

import com.net.garage.dto.GarageDTO;
import com.net.garage.service.repository.GarageRepositoryImpl;


public class GarageServiceImpl implements GarageService {

	@Override
	public boolean validateAndSave(GarageDTO dto) {
		int id=dto.getTotalTools();
	    String name=dto.getGarageName();
	    String founder= dto.getOwnerName();
	    int total=dto.getTotalWorker();
	    int since=dto.getSince();
	     if(id>0 && id<3000) {
	    	 System.out.println("looks valid");
	    	 if(name!=null && name.length()>3 && name.length()<50  && !name.contains("@") && !name.contains("#")) {
	    		 System.out.println("looks valid");
	    		 if(founder!=null && founder.length()>3 && founder.length()<50 && !founder.contains("@") && !founder.contains("#") ) { 
	    			 System.out.println("looks valid ");
	    			 if(since>1987 && since<2022) {
	    				 System.out.println("looks valid");
	    				 if(total>0 && total<5000) {
	    					 System.out.println("looks all are valid");
	    					 GarageRepositoryImpl impl=new GarageRepositoryImpl();
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
	     }else {
	    	 System.err.println("invalid");
	     }

		return false;
	}

}
