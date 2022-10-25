package com.net.travel.bugger;

import com.net.travel.dao.TousistPlaceDAO;
import com.net.travel.daoimp.ToursitPlaceDAOImp;
import com.net.travel.exception.InvalidPlaceException;
import com.net.travel.service.ToursitService;
import com.net.travel.serviceImp.ToursritServiceImp;

public class Bugger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TousistPlaceDAO tourist=new ToursitPlaceDAOImp();
		ToursitService ok=new ToursritServiceImp(tourist);
	try {
		boolean no=ok.validation("beluru");
		System.out.println("bangalore");
		ok.validation("mysore");
		ok.validation("humpi");
		ok.validation("go");
		ok.validation("huugyydfgouhgdf");
		ok.validation("mangalore");
		ok.validation("karnataka");
		ok.validation("india");
	}catch(InvalidPlaceException mgr) {
		System.out.println(mgr.getClass());
		System.out.println(mgr.getMessage());
	}	
	}
}
