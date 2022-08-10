class ArmyRunner
{
	public static void main(String[] nuk)
	{
		Army army=new Army("nagesh",250,"gokak","belagavi");
		System.out.println(army.name);
		FightingEquipments[] materials;
		army.materials=FightingEquipments.materials;
		army.printData();
	     
	}
}