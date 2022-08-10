class CellRunner
{
	public static void main(String[] nuk)
	{
		String[] names={"nagesh","rocky","garuda","man"};
		double[] table={9.30d,10.00d,10.30d,11.00};
		Cell cell=new Cell("kempegowda",names,table);
		cell.nagesh(3,4);
		System.out.println(cell.name);
	}
}	
