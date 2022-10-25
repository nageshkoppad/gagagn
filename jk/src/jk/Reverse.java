package jk;

public class Reverse {

	public static void main(String[] args) {
	
		
		/*String name="anna";
		String rev="m";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		name.equals(rev);
		System.out.println(rev);
		System.out.println(name.equals(rev));
		   ----or---
		*/
		
		String name="jaaava";
		char[] c=name.toCharArray();
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+c[i];
		}
		System.out.println(rev);
	}
}
