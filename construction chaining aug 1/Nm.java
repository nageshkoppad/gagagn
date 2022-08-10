class Nm
{
	String name;
	int noOfStaffs;
	String inspectorName;
	String[] kaidiNames;
Nm(String[] kaidiNames)
{
this.kaidiNames=kaidiNames;
}
	void printData()
	{
	for(int a=0;a<this.kaidiNames.length;a++)
	{
	System.out.println(this.kaidiNames[a]);
}
}
}	
