package dao;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LakeDAOImplementor lake=new LakeDAOImplementor();
		lake.save("ganga");
		lake.save("yamuna");
		lake.save("badra");
		lake.save("kaveri");
		lake.save("bhrahm");
		lake.printsAllLakes();
		lake.updateByIndex(2,"gokak");
		lake.printsAllLakes();
		lake.deleteByIndex(1);
		lake.printsAllLakes();
	}

}
