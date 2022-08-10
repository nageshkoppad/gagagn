class Room
{
	String name;
	int noOfCells;
	String[] staffNames;
	int noOfGates;
	
	Room(String name,String[] staffNames)
	{
	this.name=name;	
	this.staffNames=staffNames;	
    }
	void nagesh(int noOfCells,int noOfGates)
	{
		this.noOfCells=noOfCells;
		this.noOfGates=noOfGates;	
		    System.out.println(this.name);
			System.out.println(this.noOfCells);
			System.out.println(this.noOfGates);
			for(int a=0;a<this.staffNames.length;a++)
		{
			System.out.println(this.staffNames[a]);

		}
	}
}