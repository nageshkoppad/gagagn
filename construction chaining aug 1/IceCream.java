class IceCream
{
	String flavor;
	double price;
	String type;
	String brand;
	double weight;
	double quality;
	double quantity;
	boolean dryFruit;
	boolean goodTaste;
	int since;
	IceCream()
	{
	 this();	
	}
	IceCream(String flavor)
	{
		this();
		this.flavor=flavor;
	}
	IceCream(String flavor,double price)
	{
		this(flavor);
		this.price=price;
	} 
	IceCream(String  flavor
	,double price,String type)
	{
		this(flavor,price);
		this.type=type;
	}
	IceCream(String flavor,double price,String type,String brand)
	{
		this(flavor,price,type);
	}
	IceCream(String flavor,double price,String type,String brand,double weight)
	{
		this(flavor,price,type,brand);

	}
	IceCream(String flavor,double price,String type,String brand,double weight,double quality)
	{
		this(flavor,price,type,brand,weight);
	}
	 IceCream(String flavor,double price,String type,String brand,double weight,double quality,double quantity)
	 {
		this(flavor,price,type,brand,weight,quantity);
	 }
	 IceCream(String flavor,double price,String type,String brand,double weight,double quality,double quantity,boolean dryFruit)
	 {
		 this(flavor,price,type,brand,weight,quantity,quantity);
	 }
	 IceCream(String flavor,double price,String type,String brand,double weight,double quality,double quantity,boolean dryFruit,boolean goodTaste)
	 {
		 this(flavor,price,type,brand,weight,quantity,quantity,dryFruit);
	 }
   IceCream(String flavor,double price,String type,String brand,double weight,double quality,double quantity,boolean dryFruit,boolean goodTaste,int since)
   {
	   this(flavor,price,type,brand,weight,quantity,quantity,dryFruit,goodTaste);
   }
	
}