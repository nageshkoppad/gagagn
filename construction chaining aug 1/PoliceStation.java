class PoliceStation
{
	String name;
	int noOfStaffs;
	String inspectorName;
	String[] kaidiNames;
	
	PoliceStation(String name,int noOfStaffs,String inspectorName,String[] kaidiNames)
	{
	this.name=name;
	this.noOfStaffs=noOfStaffs;
    this.inspectorName=inspectorName;
	this.kaidiNames=kaidiNames;
	void printData()
	{
	System.out.println(this.name);
	System.out.println(this.noOfStaffs);
	System.out.println(this.inspectorName);
	for(int a<0;a<kaidiNames-1;a++)
		System.out.println(this.kaidiNames[a]);
	}
	policeStation.printData();
	}
}