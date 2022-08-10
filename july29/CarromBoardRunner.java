class CarromBoardRunner
{
	public static void main(String[] nuk)
	{
		CarromBoard Properties1=new CarromBoard();
		CarromBoard Properties3=new CarromBoard();
		CarromBoard Properties4=new CarromBoard();
		CarromBoard Properties5=new CarromBoard();
	
		System.out.println(Properties1.totalCoins);
		System.out.println(Properties1.blackCoins);
		System.out.println(Properties1.coinColor);
		System.out.println(Properties1.strikerColor);
		System.out.println(Properties1.whiteCoins);
		
		CarromBoard Properties2=new  CarromBoard(50,5,"blue",50);
		System.out.println(Properties2.totalCoins);
		System.out.println(Properties2.blackCoins);
		System.out.println(Properties2.coinColor);
		System.out.println(Properties2.strikerColor);
		System.out.println(Properties2.whiteCoins);

		Properties3.totalCoins=200;
		Properties3.blackCoins=100;
		Properties3.coinColor=3;
		Properties3.strikerColor="Green";
		Properties3.whiteCoins=100;
		System.out.println(Properties3.totalCoins);
		System.out.println(Properties3.blackCoins);
		System.out.println(Properties3.coinColor);
		System.out.println(Properties3.strikerColor);
		System.out.println(Properties3.whiteCoins);
		
		Properties4.totalCoins=500;
		Properties4.blackCoins=250;
		Properties4.coinColor=3;
		Properties4.strikerColor="red"
		Properties4.whiteCoins=250;
		System.out.println(Properties4.totalCoins);
		System.out.println(Properties4.blackCoins);
		System.out.println(Properties4.coinColor);
		System.out.println(Properties4.strikerColor);
		System.out.println(Properties4.whiteCoins);
		
		Properties5.totalCoins=1000;
		Properties5.blackCoins=500;
		Properties5.coinColor=3;
		Properties5.strikerColor="yellow";
		Properties5.whiteCoins=500;
		System.out.println(Properties5.totalCoins);
		System.out.println(Properties5.blackCoins);
		System.out.println(Properties5.coinColor);
		System.out.println(Properties5.strikerColor);
		System.out.println(Properties5.whiteCoins);
		
		
	}
}