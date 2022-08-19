package com.sever.project6;
import com.sever.project6.baseclass.Plastic;
import com.sever.project6.subclass.Pipe;
public class PipeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pipe pipe = new Pipe("Water Pipe", "green", true, 0.5, 5, 300);
		pipe.torisu();
		
		System.out.println();
		Plastic plastic = new Pipe("water pipe","green",true);
		Pipe convo = (Pipe)plastic;
		convo.torisu();
		
		System.out.println();
		convo = new Pipe("Water Pipe", "green", true, 0.5, 5, 300);
		convo.torisu();

	}

}
