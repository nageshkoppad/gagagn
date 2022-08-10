class Train
{
	public static void main(String[] nuk)
	{
		String vegetableNames[]={"lady finger","cucumber","potatto"};
		Book.ticketAvailable(vegetableNames);
		double[] out=Book.ticketAvailable(vegetableNames);
		System.out.println(out);
		double[] price={10d,20d,30d,40d};
		Book.plan();
	}
}