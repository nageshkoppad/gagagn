package com.net.copy.serviceimp;

import com.net.copy.dao.CasinoDAO;
import com.net.copy.service.CasinoService;

public class CasinoServiceImp implements CasinoService {
private CasinoDAO casinoDao;

public CasinoServiceImp(CasinoDAO casinoDao) {
	this.casinoDao=casinoDao;
}

@Override
public boolean checkAndValidate(String name) {
	if(name!=null && name.length()>3 && name.length()<50) {
		System.out.println("name is present");
		return true;
	}
	else {
		System.out.println("name is not present");
	}
	return false;
}
}
