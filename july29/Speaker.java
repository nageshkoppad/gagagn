class Speaker
{
	static int volume=100;
	int frequency=24;
	int rate=2000;
	String brandName="power";
	String  usedFor="sound";
	
	Speaker()
	{
		
	}
	Speaker(int frequency1,int rate1,String brandName1,String usedFor1)
	{
		frequency=frequency1;
		rate=rate1;
		brandName=brandName1;
		usedFor=usedFor1;
	}
}