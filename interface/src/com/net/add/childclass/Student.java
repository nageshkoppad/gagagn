package com.net.add.childclass;

import com.net.add.parentclass.School;

public class Student implements School {
	
	
	public Student() {
		System.out.println("rules are done by school");
	}

	@Override
	public String timing() {
		return  "10.00 & 5.00";
	}

	@Override
	public int fees() {
		// TODO Auto-generated method stub
		return  6000;
	}

}
