package jk;
import java.util.Scanner;
public class Trail {

	int addcost(int input1,int input2[],int intput3) {
		int firstInput1=input1;
		int[] secondinput2=input2;
		int  thirdIntput3=intput3;
		int sum=0;
		int cost=0;
		for(int i=0;i<=firstInput1;i++) {
			sum=sum+secondinput2[i];
			cost=sum*thirdIntput3;
		   }
		System.err.println("total cost="+cost);
		return 0;
	}
	public static void main(String[] args) {
		Trail trail=new Trail();
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int[] store= {1,2,3,4};
		trail.addcost(a,store, b);
	}
	
}
