package com.net.copy.daoimp;

import com.net.copy.dao.CasinoDAO;
import com.net.copy.dto.CasinoDTO;

public class CasinoImp implements CasinoDAO {
   
	private String[] dataStore=new String[4];
	
	public int index;
	@Override
	public boolean creat(String name) {
		this.dataStore[index]=name;
		System.out.println("data stored"+name+"index="+this.index);
		index++;
		return false;
	}
	@Override
	public boolean checkName(String name) {
		for(int position=0;position<this.dataStore.length;position++) {
		String ref=this.dataStore[position];
			if(ref.equals(name))
				return true;
			}
		return false;
	}
}
