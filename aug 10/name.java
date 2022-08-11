class name  
{
	public static void main(String[] nuk)
	{
		String nuk=new String();
		System.out.println(nuk);
		
		String ntr=new String("rana");
		System.out.println(ntr);
		System.out.println(ntr.toUpperCase());
		String ntr1=new String(ntr);
		System.out.println(ntr1);
		
		StringBuffer sb=new StringBuffer("Darshan");   //creat mutable object
		String s2=new String(sb);         //creat immutable object
		System.out.println(s2);
		
		StringBuilder mb=new StringBuilder("Kranti");   //creat mutable object
		String s1=new String(mb);                 //creat immutable object
		System.out.println(s1);
		
		byte[] b={1,2,3};
		String s3=new String(b);
		System.out.println(s3);
		
		char[] c={'a','b','c'};
		String mc=new String(c);
		System.out.println(mc);
		
		byte[] d={1,2,3};
		charset[] k={'abcd'};
		String mk=new String(d,k);
		System.out.println(mk);
	}	
}