package com.net.travel.serviceImp;

import com.net.travel.dao.TousistPlaceDAO;
import com.net.travel.exception.InvalidPlaceException;
import com.net.travel.service.ToursitService;

public class ToursritServiceImp implements ToursitService {

	private TousistPlaceDAO tourist;

	public ToursritServiceImp(TousistPlaceDAO tourist) {
		super();
		this.tourist = tourist;
	}

	@Override
	public boolean validation(String places) throws InvalidPlaceException {
		if(places!=null && places.length()<50 && places.length()>2) {
			System.out.println("place is  valid,"+places);
			boolean checkName=this.tourist.checkName(places);
			if(checkName) {                                         //  true executes
			System.err.println("place is already exists  ="+places);
			throw new InvalidPlaceException("not valid");
			
		}
	  else {
		boolean yes=this.tourist.save(places);                     // false executes
		return yes;
      }
}
System.out.println("place looks invalid, cannot all dao and save");
	throw new InvalidPlaceException("not valid");
}
}
