package com.server.project2;

import com.server.project2.baseclass.KeyBoard;
import com.server.project2.subclass.TouchPad;

public class TouchPadRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TouchPad touchPad=new TouchPad();
		touchPad.price1=200;
		touchPad.uses="temap";
		touchPad.worksGood=false;
		touchPad.totalKeys=125;
		touchPad.totalAlph=25;
		touchPad.price=500;
		touchPad.torisu1();
		touchPad.torisu2();
		touchPad.torisu3();
	
	}

}
