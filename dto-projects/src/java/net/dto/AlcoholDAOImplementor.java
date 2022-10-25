package java.net.dto;

public class AlcoholDAOImplementor implements AlcoholDAO {

	 private AlcoholDTO[] methene=new AlcoholDTO[3];
	public int index=0;
	@Override
	public boolean creat(AlcoholDTO dto) {
	this.methene[index]=dto;
	this.index++;
		return true;
	}
	@Override
	public void printAll(AlcoholDTO dto) {
	
}
	}
