class Park
{
	public static void main(String[] nuk)
	{
		Garden.tree("brundavan");
		Garden.tree("gokak",1000d);
		Garden.tree("gokak","brundavan",1000d);
		Garden.tree(1000d,"gokak");
		Garden.tree(true);
		Garden.tree("mango",true);
	}
}