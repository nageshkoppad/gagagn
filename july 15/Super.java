class Super
{
	public static void buy(String name)
	{
		System.out.println(name);
	}	
	public static void buy(double cost)
	{
		System.out.println(cost);
	}
	public static void buy(String name,double cost)
	{
		System.out.println(name+cost);
	}
	public static void buy(boolean bigSize)
	{
		System.out.println(bigSize);
	}
	public static void buy(boolean bigSize,String name)
	{
		System.out.println(bigSize+name);
	}
	public static void buy(double cost,String name,boolean bigSize)
	{
		System.out.println(cost+name+bigSize);
	}
}	