class Pub
{
	public static void main(String[] nuk)
	{
		Drinks.drink(1000d);
		Drinks.drink("redbull");
		Drinks.drink(1000d,"redbull","vine");
		Drinks.drink(true);
		Drinks.drink("redbull",1000d,true);
		Drinks.drink("redbull",100000d);	
	}
}