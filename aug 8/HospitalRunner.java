class HospitalRunner
{
	public static void main(String[] nuk)
	{
		Founder founder=new Founder("swami","gokak",1999,true,124584);
		Hospital hospital=new Hospital();
		String[] ok={"lase","injection","blade","knife"};
		hospital.setValues("nagesh",ok,1000,founder);
	}
}