class ChoclateTester{

public static void main(String[] test){
	Choclate Choclate=new Choclate();
	Choclate.name="Arun";
	Choclate.flavour="Choco";
	Choclate.brand="aone";
	Choclate.price=555;
	System.out.println(	Choclate.name);
	System.out.println(	Choclate.flavour);
	System.out.println(	Choclate.brand);
	System.out.println(	Choclate.price);
	Choclate Choclate1=new Choclate("Arun");
	Choclate1.flavour="Choco";
	Choclate1.brand="aone";
	Choclate1.price=888;
	System.out.println(	Choclate1.name);
	System.out.println(	Choclate1.flavour);
	System.out.println(	Choclate1.brand);
	System.out.println(	Choclate1.price);
	Choclate Choclate2=new Choclate("Arun","choco");
	Choclate2.brand="aone";
	Choclate2.price=123;
	System.out.println(	Choclate2.name);
	System.out.println(	Choclate2.flavour);
	System.out.println(	Choclate2.brand);
	System.out.println(	Choclate2.price);
	Choclate Choclate3=new Choclate("Arun","choco","aone");
	Choclate3.price=986;
	System.out.println(	Choclate3.name);
	System.out.println(	Choclate3.flavour);
	System.out.println(	Choclate3.brand);
	System.out.println(	Choclate3.price);
	Choclate Choclate4=new Choclate("Arun","choco","aone",856);
	System.out.println(	Choclate4.name);
	System.out.println(	Choclate4.flavour);
	System.out.println(	Choclate4.brand);
	System.out.println(	Choclate4.price);


}



}