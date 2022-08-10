class AlcoholRunner
{
	public static void main(String[] nuk)
	{
		Alcohol properties1=new Alcohol();
		Alcohol properties3=new Alcohol();
		Alcohol properties4=new Alcohol();
		Alcohol properties5=new Alcohol();
		System.out.println(properties1.rate);
		System.out.println(properties1.brand);
		System.out.println(properties1.gradients);
		System.out.println(properties1.contains);
		System.out.println(properties1.types);
		
		Alcohol properties2=new Alcohol();
		System.out.println(properties2.rate);
		System.out.println(properties2.brand);
		System.out.println(properties2.gradients);
		System.out.println(properties2.contains);
		System.out.println(properties2.types);
		
		properties3.rate=2500
		properties3.brand="royal whisky"
		properties3.gradients=15;
		properties3.contains=methyle;
		properties3.types=250;
		System.out.println(properties3.rate);
		System.out.println(properties3.brand);
		System.out.println(properties3.gradients);
		System.out.println(properties3.contains);
		System.out.println(properties3.types);
		
			
		properties4.rate=450;
		properties4.brand="vodka";
		properties4.gradients=75;
		properties4.contains="methyle"
		properties4.types=250;
		System.out.println(properties4.rate);
		System.out.println(properties4.brand);
		System.out.println(properties4.gradients);
		System.out.println(properties4.contains);
		System.out.println(properties4.types);
	
		
		properties5.rate=10000;
		properties5.brand="rum";
		properties5.gradients=85;
		properties5.contains="methyle";
		properties5.types=400;
		System.out.println(properties5.rate);
		System.out.println(properties5.brand);
		System.out.println(properties5.gradients);
		System.out.println(properties5.contains);
		System.out.println(properties5.types);
	}
}