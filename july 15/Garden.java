class Garden
{
	public  static void tree(String name)
	{
		System.out.println(name);
	}
	public static void tree(String place,double totalTree)
	{
		System.out.println(place+totalTree);
	}
	public static void tree(String place,String name,double totalTree)
	{
		System.out.println(place+name+totalTree);
	}
	public static void tree(double totalTree,String place)
	{
		System.out.println(totalTree+place);
	}
	public static void tree(boolean itIsPublic)
	{
		System.out.println(itIsPublic);
	}
	public static void tree(String totalTree,boolean itIsPublic)
	{
		System.out.println(totalTree+itIsPublic);
	}
	
}