class DateRunner
{
	public static void main(String[] nuk)
	{
		Date date=new Date();
		Date date1=new Date(1);
		System.out.println(date1.day);
		System.out.println("--------------------------------------------");
		Date date2=new Date(1,2);
		System.out.println(date2.day);
		System.out.println(date2.month);
        System.out.println("--------------------------------------------");	
		Date date3=new Date(1,2,3);
		System.out.println(date3.day);
		System.out.println(date3.month);
		System.out.println(date3.year);
		System.out.println("--------------------------------------------");
		Date date4=new Date(1,2,3,"tue");
		System.out.println(date4.day);
		System.out.println(date4.month);
		System.out.println(date4.year);
		System.out.println(date4.day2);
	}
}