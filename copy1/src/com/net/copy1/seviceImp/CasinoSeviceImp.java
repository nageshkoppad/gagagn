package com.net.copy1.seviceImp;

import com.net.copy1.dao.CasinoDAO;
import com.net.copy1.sevice.CasinoService;

public class CasinoSeviceImp implements CasinoService {
	private CasinoDAO casinoDao;

	public CasinoSeviceImp(CasinoDAO casinoDao) {
		super();
		this.casinoDao = casinoDao;
	}

	@Override
	public boolean checkAndValidate(String name) {
		if(name!=null && name.length()>3 && name.length()<50) {
			boolean present=this.casinoDao.checkName(name);
			if(!present) {
				System.out.println("name is not null,looks valid");
				this.casinoDao.creat(name);
				return true;
			}
		}
			System.out.println("data looks invalid,cannot call dao and save");
		return false;
	}
	
}
