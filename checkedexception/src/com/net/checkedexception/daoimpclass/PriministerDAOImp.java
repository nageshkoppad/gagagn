package com.net.checkedexception.daoimpclass;

import com.net.checkedexception.daoclass.PriministerDAO;

public class PriministerDAOImp implements PriministerDAO{

	private String[] collection=new String[10];
	private int index;
	
	@Override
	public boolean store(String name) {
	      this.collection[index]=name;
	      System.out.println("name="+name+" "+"index="+this.index);
	      this.index++;
		return false;
	}

	@Override
	public boolean checkName(String name) {
		for(String store:this.collection) {
			if(store!=null && store.equals(name)) {
				return true;
			}
		}
		return false;
	}

}
