class Mall
{
	public static void main(String[] nuk)
	{
		Super.buy("ganesh");
		Super.buy(40000000d);
		Super.buy("ganesh",40000000d);
		Super.buy(true);
		Super.buy(true,"ganesh");
		Super.buy(40000000d,"ganesh",true);
	}
}