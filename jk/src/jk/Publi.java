package jk;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Publi {

	private static final int DELAY = 150;

	public static void main(String[] args) {
		
		
		int width=600;
		int height=600;
		int unitSize=25;
		Timer timer;
		timer = new Timer (DELAY,timer);
		timer.restart();
		int unit=(width*height)/unitSize;	
		int x[]=new int[unit];
		int y[]=new int[unit];
		int bodyParts=6;
		 for(int i = 0; i< bodyParts;i++) {
		     if(i == 0) {
			     System.out.println("*");
		     }
		     else {
		    	 System.out.println("&");
		     }
		     bodyParts++;
		     x[0]=x[0]-unit;
	}
		
	}
}
