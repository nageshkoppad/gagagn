package com.net.checkedexception.serviceimp;

import com.net.checkedexception.daoclass.PriministerDAO;
import com.net.checkedexception.exception.InvalidPriministerName;
import com.net.checkedexception.service.PriministerService;

public class PriministerServiceImp implements PriministerService {
  private PriministerDAO dao;
  
  
	public PriministerServiceImp(PriministerDAO dao) {
	super();
	this.dao = dao;
}
	@Override
	public boolean validationAndCheck(String name)throws InvalidPriministerName {
		if(name!=null && name.length()>4 && name.length()<50) {
		  boolean present=this.dao.checkName(name);
		  if(present) {
			  System.err.println("already exaist="+name);
			  throw new InvalidPriministerName("not valid");
		  }else {
			  System.out.println("name not already present");
			  this.dao.store(name);
		  }
		}else {
			System.err.println("name looks inavalid does not call dao and save");
			throw new InvalidPriministerName("not  valid");
		}
		return true;
  }
}	
	
