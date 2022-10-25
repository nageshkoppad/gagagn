package jk;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		int n=scan.nextInt();
		int a=0;
		for(int i=1;i<=10;i++) {
			a=i*n;
			if(a%n == 0) {
				System.out.println("not prime");
			}else if(n%1 == n) {
				System.out.println("prime");	
			}
			   }
		
	}

}
