package com.net.travel.daoimp;

import com.net.travel.dao.TousistPlaceDAO;

public class ToursitPlaceDAOImp implements TousistPlaceDAO {

	private String[] dataStore=new String[10];
	public int index;
	@Override
	public boolean save(String places) {
		this.dataStore[this.index]=places;
		System.out.println("data stored="+places+" "+"index="+this.index);
		this.index++;
		return false;
	}
	@Override
	public boolean checkName(String places) {
		for(String ref:this.dataStore) {
			if(ref!=null && ref.equals(places)) 
			return true;
		}
		return false;
	}

}
