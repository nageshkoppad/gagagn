class Sys
{
	public static void main(String[] nuk)
		{
		String name1=nuk[0];
		String name2=nuk[1];
		String fullname=name1+name2;
		boolean male=true;
	if(male)
	{
		String gender="mr.";
		String clock=gender+fullname;
		System.out.println(clock);
	}
	else{
		String gender2="miss.";
		String lock=gender2+fullname;
		System.out.println(lock);	
	}
	}
}