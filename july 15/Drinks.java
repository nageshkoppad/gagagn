class Drinks
{
	public static void drink(double rate)
	{
		System.out.println(rate);
	}
	public static void drink(String name1)
	{
		System.out.println(name1);
	}
	public static void drink(double rate,String name2,String name3)
	{
		System.out.println(rate+name2+name3);
	}
	public static void drink(boolean leagal)
	{
		System.out.println(leagal);
	}
	public static void drink(String name,double rate,boolean leagal)
	{
		System.out.println(name+rate+leagal);
	}
	public static void drink(String rate,double totalBrands)
	{
		System.out.println(rate+totalBrands);
	}
}