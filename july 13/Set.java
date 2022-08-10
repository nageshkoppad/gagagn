class Set{
	public static  void eat(String item,double time)
	{
		System.out.println(item+time);
	}
	public static void sleep(double start,double end)
	{
		System.out.println(start+end);
	}
	public static void burnCalories()
	{
		System.out.println("1000grams");
		Set.run(2.0d);
	}
	public static void run(double distance)
	{
		System.out.println(distance);
	}
}