package com.net.checkedexception.bugger;

import com.net.checkedexception.daoclass.PriministerDAO;
import com.net.checkedexception.daoimpclass.PriministerDAOImp;
import com.net.checkedexception.exception.InvalidPriministerName;
import com.net.checkedexception.service.PriministerService;
import com.net.checkedexception.serviceimp.PriministerServiceImp;

public class Bugger {

	public static void main(String[] args) {
		
		PriministerDAO dao=new PriministerDAOImp();
		PriministerService service=new PriministerServiceImp(dao);
		try {
		service.validationAndCheck("narendra moadi");
		service.validationAndCheck("desai1");
		service.validationAndCheck("desai2");
		service.validationAndCheck("desai2");
		service.validationAndCheck("nagesh");
		service.validationAndCheck("manamohan singh");
		service.validationAndCheck("karnataka");
		}catch(InvalidPriministerName mgr) {
			System.out.println(mgr.getClass());
			System.out.println(mgr.getMessage());
		}
		
		}
}
