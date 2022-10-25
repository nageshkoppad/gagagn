package com.net.copy.bugger;

import com.net.copy.dao.CasinoDAO;
import com.net.copy.daoimp.CasinoImp;
import com.net.copy.serviceimp.CasinoServiceImp;

public class bugger {

	public static void main(String[] args) {
		
	CasinoDAO casinoDao=new CasinoImp();
	casinoDao.creat("sudeep");
	casinoDao.creat("boss");
	boolean checkName=casinoDao.checkName("boss");
	System.out.println("name is repeted="+checkName);
		
 CasinoServiceImp casinoService=new CasinoServiceImp(casinoDao);
 
 boolean checkAndValidate=casinoService.checkAndValidate("s");
 System.out.println("name is not null="+checkAndValidate);
 System.out.println("name length is more than 50="+checkAndValidate);
 System.out.println("name length is less than 3="+checkAndValidate);
	}
}
