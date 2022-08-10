class BusStop
{
	String stopName;
	String startingPoint;
	String endPoint;
	int totalBench;
	String[] passangerNames;
	double[] timings;
	
	BusStop(String stopName,int totalBench,String[] passangerNames,double[] timings)
	{
		this.stopName=stopName;
		this.totalBench=totalBench;
		this.passangerNames=passangerNames;
		this.timings=timings;
	}
	void nagesh(String startingPoint,String endPoint)
	{
		this.startingPoint=startingPoint;
		this.endPoint=endPoint;
		System.out.println(this.startingPoint);
		System.out.println(this.endPoint);
		for(int a=0;a<this.passangerNames.length;a++)
		{
			System.out.println(this.passangerNames[a]);
		}
		for(int a=0;a<this.timings.length;a++)
		{
			System.out.println(this.timings[a]);
		}
	}
	
}