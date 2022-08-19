package com.server.project4;
import com.server.project4.subclass.Earth;
import com.server.project4.baseclass.Planet;
public class EarthRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Earth earth = new Earth("Earth", 3, 6713,true,151.43,7);
		earth.torisu();
		
		System.out.println();
		Planet planet = new Earth("Earth", 3, 6713);
		Earth convo = (Earth)planet;
		convo.torisu();
		
		System.out.println();
		convo = new Earth("Earth", 3, 6713,true,151.43,7);
		convo.torisu();

	}

}
