class  Biscuit
{
	String brand;
	int price;
	int expiryDate;
	int weight;
	String manuFacturedBy;
	int quantity;
	int noOfPieces;
	
	Biscuit()
	{
		
	}
	Biscuit(String brand)
	{
	this();
	this.brand=brand;
	}
	Biscuit(String brand,int price)
	{
		this(brand);
		this.price=price;
	}
	Biscuit(String brand,int price,int expiryDate)
	{
		this(brand,price);
		this.expiryDate=expiryDate;
	}
	Biscuit(String brand,int price,int expiryDate,int weight)
	{
	this(brand,price,expiryDate);
	this.weight=weight;
	}
	Biscuit(String brand,int price,int expiryDate,int weight,String manuFacturedBy)
	{
		this(brand,price,expiryDate,weight);
		this.manuFacturedBy=manuFacturedBy;
	}
	Biscuit(String brand,int price,int expiryDate,int weight,String manuFacturedBy,int quantity)
	{
		this(brand,price,expiryDate,weight,manuFacturedBy);
		this.quantity=quantity;
	}
	Biscuit(String brand,int price,int expiryDate,int weight,String manuFacturedBy,int quantity,int noOfPieces)
	{
		this(brand,price,expiryDate,weight,manuFacturedBy,quantity);
		this.noOfPieces=noOfPieces;
	}
}	