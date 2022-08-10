class Hospital
{
	String name;
    String specilaization;
	String[] equipments;
	int consultatioFees;
	Founder founder;
void setValues(String name,String[] equipments,int consultatioFees,Founder founder)
{
	this.name=name;
	this.equipments=equipments;
	this.consultatioFees=consultatioFees;
	this.founder=founder;
	System.out.println(name);
	System.out.println(specilaization);
	for(int a=0;a<equipments.length;a++)
	System.out.println(equipments);
	System.out.println(founder.name);
	System.out.println(founder.from);
	System.out.println(founder.since);
	System.out.println(founder.alive);
	System.out.println(founder.income);
}
}