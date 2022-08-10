class GymRunner
{
	public static void main(String[] nuk)
	{
		Gym gym=new Gym();
		Gender[] raj={Gender.FEMALE,Gender.MALE,Gender.OTHERS};
		Trainer trainer=new Trainer("jk",1245845l,14);
		trainer.setGender(raj);
		gym.loginData("hk",124,"dumble",trainer);
	}
		
}