package com.net.copy1.daoimp;

import com.net.copy1.dao.CasinoDAO;

public class CasinoDAOImp implements CasinoDAO {
private String[] dataStore=new String[4];
	public int index;
	@Override
	public boolean creat(String name) {
		this.dataStore[this.index]=name;
		System.out.println("data stored="+name+" "+"index="+this.index);
		this.index++;
		return false;
	}
	@Override
	public boolean checkName(String name) {
		for(int position=0;position<this.dataStore.length;position++) {
		String ref=this.dataStore[position];
			if(ref!=null && ref.equals(name))
				return true;
			}
		return false;
	}

}
