class CarromBoard
{
	static int totalCoins=50;
	int blackCoins=25;
	int coinColor=3;
	String strikerColor="red";
	int whiteCoins=25;
	
	CarromBoard()
	{
		
	}
	CarromBoard(int coins,int color,String color2,int coins2)
	{
		blackCoins=coins;
		coinColor=color;
		strikerColor=color2;
		whiteCoins=coins2;
	}
}