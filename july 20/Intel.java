class Intel
{
	public static void main(String[] nuk)
	{
		String firstName="nagesh";
		String lastName="koppad";
		String space=" ";
		String fullname=firstName+space+lastName;
		String drone=Note.getFullName(firstName,lastName,true);
		System.out.println(drone);
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
	
	
