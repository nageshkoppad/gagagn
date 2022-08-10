class SpeakerRunner
{
	public static void main(String[] nuk)
	{
		Speaker properties1=new Speaker();
		System.out.println(properties1.volume);
		System.out.println(properties1.frequency);
		System.out.println(properties1.rate);
		System.out.println(properties1.brandName);
		System.out.println(properties1.usedFor);
		
		Speaker properties2=new Speaker(50,5000,"boom","hearing");
		System.out.println(properties2.volume);
		System.out.println(properties2.frequency);
		System.out.println(properties2.rate);
		System.out.println(properties2.brandName);
		System.out.println(properties2.usedFor);
		
		properties3.volume=100;
		properties3.frequency=65;
		properties3.rate=2500;
		properties3.brandName="rolls royce";
		properties3.usedFor="sound"
		System.out.println(properties3.volume);
		System.out.println(properties3.frequency);
		System.out.println(properties3.rate);
		System.out.println(properties3.brandName);
		System.out.println(properties3.usedFor);
		
		properties4.volume=100;
		properties4.frequency=48;
		properties4.rate=3000;
		properties4.brandName="bose";
		properties4.usedFor="sound"
		System.out.println(properties4.volume);
		System.out.println(properties4.frequency);
		System.out.println(properties4.rate);
		System.out.println(properties4.brandName);
		System.out.println(properties4.usedFor);
		
		properties5.volume=100
		properties5.frequency=100;
		properties5.rate=50000;
		properties5.brandName="jbl";
		properties5.usedFor="sound";
		System.out.println(properties5.volume);
		System.out.println(properties5.frequency);
		System.out.println(properties5.rate);
		System.out.println(properties5.brandName);
		System.out.println(properties5.usedFor);
	
		
	}
	
}