class Army
{
	String name;
	int totalSolder;
	String place;
	String tariningPlace;
	FightingEquipments[] materials;
	
	Army(String name,int totalSolder,String place,String tariningPlace)
	{
		this.name=name;
		this.totalSolder=totalSolder;
		this.place=place;
		this.tariningPlace=tariningPlace;
	}
	void printData()
	{
		this.FightingEquipments.materials=materials;
		for(int a=0;a<materials.length;a++)
		{
			System.out.println(materials[a]);
		}
	}
	
}