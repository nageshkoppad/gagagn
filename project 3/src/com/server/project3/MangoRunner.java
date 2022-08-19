package com.server.project3;
import  com.server.project3.subclass.Mango;
import com.server.project3.baseclass.Fruit;
public class MangoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mango mango = new Mango("mango","yellow","round",1.5d,100,true);
		mango.torisu();
		
		System.out.println();
		Fruit fruit = new Mango("mango","yellow","round");
		Mango convo = (Mango)fruit;
	
		System.out.println("");
		convo = new Mango("mango","yellow","round",2.5,200,true);
		convo.torisu();
		
	}

}
