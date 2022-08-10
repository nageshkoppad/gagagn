class PubRunner
{
	public static void main(String[] nuk)
	{
		Pub properties1=new Pub();
		Pub properties3=new Pub();
		Pub properties4=new Pub();
	    Pub properties5=new Pub();
		System.out.println(properties1.name);
		System.out.println(properties1.price);
		System.out.println(properties1.drinksAvailable);
		System.out.println(properties1.mobNum);
		System.out.println(properties1.place);
		
		Pub properties2=new Pub("king fisher",5000,12564455l,"gokaka");
		System.out.println(properties2.name);
		System.out.println(properties2.price);
		System.out.println(properties2.drinksAvailable);
		System.out.println(properties2.mobNum);
		System.out.println(properties2.place);
		
		properties3.name="abc";
		properties3.price=5000;
		properties3.drinksAvailable=120;
		properties3.mobNum=21548725l;
		System.out.println(properties3.name);
		System.out.println(properties3.price);
		System.out.println(properties3.drinksAvailable);
		System.out.println(properties3.mobNum);
		System.out.println(properties3.place);
		
		properties4.name="Fennys";
		properties4.price=2500;
		properties4.drinksAvailable=111;
		properties4.mobNum=1254872l;
		System.out.println(properties4.name);
		System.out.println(properties4.price);
		System.out.println(properties4.drinksAvailable);
		System.out.println(properties4.mobNum);
		System.out.println(properties4.place);
		
	    properties5.name="loft 38";
		properties5.price=8500;
		properties5.drinksAvailable=125;
		properties5.mobNum=1245897l;
		System.out.println(properties5.name);
		System.out.println(properties5.price);
		System.out.println(properties5.drinksAvailable);
		System.out.println(properties5.mobNum);
		System.out.println(properties5.place);
	
	}
}