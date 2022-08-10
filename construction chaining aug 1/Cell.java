class Cell
{
	String name;
	int noOfCells;
	String[] staffNames;
	int noOfGates;
	double[] timings;
	
	Cell(String name,String[] staffNames,double[] timings)
	{
	this.staffNames=staffNames;
	this.timings=timings;
    }
	void nagesh(int noOfCells,int noOfGates)
	{	
		for(int a=0;a<this.staffNames.length;a++)
		{
			System.out.println(this.staffNames[a]);
			
			
		}	
		
		for(int b=0;b<this.timings.length;b++)
			{
			System.out.println(this.timings[a]);
			}
			System.out.println(noOfCells);
			System.out.println(noOfGates);
	}
}