package dao;

import java.util.Arrays;

public class LakeDAOImplementor implements LakeDAO {
	

	private String[] lakeNames = new String[10];
	private int index;

	@Override
	public boolean save(String lakeName) {
		this.lakeNames[index] = lakeName;
		index++;
		return true;
	}

	@Override
	public void printsAllLakes() {
       System.out.println(Arrays.toString(lakeNames));
	}

	@Override
	public boolean updateByIndex(int index, String newlake) {
		this.lakeNames[index] = newlake;
		return false;
	}

	@Override
	public boolean deleteByIndex(int index) {
		this.lakeNames[index] = null;
		return false;
	}

	@Override
	public boolean updateByName(String name, String newName) {
		for (int i = 0; i < lakeNames.length; i++) {
			if(this.lakeNames[i]==name) {
				this.lakeNames[i]= newName;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
		for (int i = 0; i < lakeNames.length; i++) {
			if(this.lakeNames[i]==name) {
				this.lakeNames[i]= null;
				return true;
			}
		}
		return false;
	}


		
	}
 

