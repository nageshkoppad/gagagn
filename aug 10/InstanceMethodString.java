class InstanceMethodString{
	
	public static void main(String[] args)
	{
		
		String nuk = new String();
		String s = nuk.concat("nagesh");
		System.out.println(s);
		
		boolean s1 = nuk.endsWith("KRANTHI");
		System.out.println(s1);
		
		byte[] by = nuk.getBytes();
		System.out.println(by);
		
		int i = nuk.hashCode();
		System.out.println(i);

		int s11 = nuk.indexOf(101);
		System.out.println(s11);
		
		int s12 = nuk.indexOf(394,34);
		System.out.println(s12);
		
		int arg = nuk.indexOf("deepti",2);
		System.out.println(arg);
		
		String s10= nuk.intern();
		System.out.println(s10);
		
		boolean s9=nuk.isEmpty();
		System.out.println(s9);
		
		int s8=nuk.lastIndexOf(2453);
		System.out.println(s8);

		int s5=nuk.length();
		System.out.println(s5);

		boolean s4=nuk.matches("deepti");
		System.out.println(s4);
		
		boolean s3=nuk.regionMatches(true,2,"gasdgfsa",3,4);
		System.out.println(s3);
		
		String s2=nuk.replace('w','z');
		System.out.println(s2);
	}
}