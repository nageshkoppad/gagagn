class BiscuitRunner
{
	public static void main(String[] test)
	{
		Biscuit biscuit=new Biscuit();
		biscuit.brand="parle";
		biscuit.price=10;
		biscuit.expiryDate=3;
		biscuit.weight=10;
		biscuit.manuFacturedBy="parle";
		biscuit.quantity=20;
		biscuit.noOfPieces=10;
		System.out.println(biscuit.brand);
		System.out.println(biscuit.price);
		System.out.println(biscuit.expiryDate);
		System.out.println(biscuit.weight);
		System.out.println(biscuit.manuFacturedBy);
		System.out.println(biscuit.quantity);
		System.out.println(biscuit.noOfPieces);
		
		Biscuit biscuit1=new Biscuit("parle");
		biscuit1.price=10;
		biscuit1.expiryDate=3;
		biscuit1.weight=10;
		biscuit1.manuFacturedBy="parle";
		biscuit1.quantity=20;
		biscuit1.noOfPieces=10;
		System.out.println(biscuit1.brand);
		System.out.println(biscuit1.price);
		System.out.println(biscuit1.expiryDate);
		System.out.println(biscuit1.weight);
		System.out.println(biscuit1.manuFacturedBy);
		System.out.println(biscuit1.quantity);
		System.out.println(biscuit1.noOfPieces);
		
		Biscuit biscuit2=new Biscuit("parle",10);
		biscuit2.expiryDate=3;
		biscuit2.weight=10;
		biscuit2.manuFacturedBy="parle";
		biscuit2.quantity=20;
		biscuit2.noOfPieces=10;
		System.out.println(biscuit2.brand);
		System.out.println(biscuit2.price);
		System.out.println(biscuit2.expiryDate);
		System.out.println(biscuit2.weight);
		System.out.println(biscuit2.manuFacturedBy);
		System.out.println(biscuit2.quantity);
		System.out.println(biscuit2.noOfPieces);
		
		Biscuit biscuit3=new Biscuit("parle",10,3);
		biscuit3.weight=10;
		biscuit3.manuFacturedBy="parle";
		biscuit3.quantity=20;
		biscuit3.noOfPieces=10;
		System.out.println(biscuit3.brand);
		System.out.println(biscuit3.price);
		System.out.println(biscuit3.expiryDate);
		System.out.println(biscuit3.weight);
		System.out.println(biscuit3.manuFacturedBy);
		System.out.println(biscuit3.quantity);
		System.out.println(biscuit3.noOfPieces);
		
		Biscuit biscuit4=new Biscuit("parle",10,3,10);
		biscuit4.manuFacturedBy="parle";
		biscuit4.quantity=20;
		biscuit4.noOfPieces=10;
		System.out.println(biscuit4.brand);
		System.out.println(biscuit4.price);
		System.out.println(biscuit4.expiryDate);
		System.out.println(biscuit4.weight);
		System.out.println(biscuit4.manuFacturedBy);
		System.out.println(biscuit4.quantity);
		System.out.println(biscuit4.noOfPieces);
		
		Biscuit biscuit5=new Biscuit("parle",10,3,10,"parle");
		biscuit5.quantity=20;
		biscuit5.noOfPieces=10;
		System.out.println(biscuit5.brand);
		System.out.println(biscuit5.price);
		System.out.println(biscuit5.expiryDate);
		System.out.println(biscuit5.weight);
		System.out.println(biscuit5.manuFacturedBy);
		System.out.println(biscuit5.quantity);
		System.out.println(biscuit5.noOfPieces);
        Biscuit biscuit6=new Biscuit("parle",10,3,10,"parle",20);
		biscuit6.noOfPieces=10;
		System.out.println(biscuit6.brand);
		System.out.println(biscuit6.price);
		System.out.println(biscuit6.expiryDate);
		System.out.println(biscuit6.weight);
		System.out.println(biscuit6.manuFacturedBy);
		System.out.println(biscuit6.quantity);
		System.out.println(biscuit6.noOfPieces);
		
		Biscuit biscuit7=new Biscuit("parle",10,3,10,"parle",20,10);
		System.out.println(biscuit7.brand);
		System.out.println(biscuit7.price);
		System.out.println(biscuit7.expiryDate);
		System.out.println(biscuit7.weight);
		System.out.println(biscuit7.manuFacturedBy);
		System.out.println(biscuit7.quantity);
		System.out.println(biscuit7.noOfPieces);
		
	}
}