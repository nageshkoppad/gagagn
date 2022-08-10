class Om
{
	public static void down(String  homeName)
	{
		System.out.println(homeName);
	}
	public static void down(long price)
	{
		System.out.println(price);
	}	
	public static void down(String homeName,long  price)
	{		
		System.out.println(homeName+price);
	}
	public static void down(double floors,long rooms)
	{
		System.out.println(floors+rooms);
	}
	public static void down(long rooms,String homeName)
	{
		System.out.println(rooms+homeName);
	}
	public static void down(long rooms,String homeName,double floors)
	{
		System.out.println(rooms+homeName+floors);
	}
	
}