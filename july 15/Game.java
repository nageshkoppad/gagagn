class Game
{
	public static void kabaddi(double players)
	{
		System.out.println(players);
	}
	public static void kabaddi(String[] names)
	{
		for(int i=0;i<7;i++)
			System.out.println(names[i]);
	}
	public static void kabaddi(double players,String name)
	{
		System.out.println(players+name);
	}
	public static void kabaddi(boolean itIsGame)
	{
		System.out.println(itIsGame);
	}
	public static void kabaddi(String players,double itIsGame)
	{
		System.out.println(players+itIsGame);
	}
	public static void kabaddi(double players,String name,boolean itIsGame)
	{
		System.out.println(players+name+itIsGame);
	}
	
}
