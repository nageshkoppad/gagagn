package com.net.copy1.bugger;
import com.net.copy1.dao.CasinoDAO;
import com.net.copy1.daoimp.CasinoDAOImp;
import com.net.copy1.sevice.CasinoService;
import com.net.copy1.seviceImp.CasinoSeviceImp;

public class bugger {

	public static void main(String[] args) {
		CasinoDAO casinoDao=new CasinoDAOImp();
		CasinoService casinoService=new CasinoSeviceImp(casinoDao);
		casinoService.checkAndValidate("money");
	casinoService.checkAndValidate("money");	
	boolean state=casinoService.checkAndValidate("mone");
	System.out.println(state);
	
	}
}

