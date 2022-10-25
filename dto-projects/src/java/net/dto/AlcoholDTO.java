package java.net.dto;
import java.io.Serializable;
import java.util.Arrays;

public class AlcoholDTO implements Serializable {
	private boolean causesHealth;
	private String[] brandTypes;
	private String[] owners;
	private int quntitity;
	
	
	 public AlcoholDTO() {
		 
	 }


	public boolean isCausesHealth() {
		return causesHealth;
	}


	public void setCausesHealth(boolean causesHealth) {
		this.causesHealth = causesHealth;
	}


	public String[] getBrandTypes() {
		return brandTypes;
	}


	public void setBrandTypes(String[] brandTypes) {
		this.brandTypes = brandTypes;
	}


	public String[] getOwners() {
		return owners;
	}


	public void setOwners(String[] owners) {
		this.owners = owners;
	}


	public int getQuntitity() {
		return quntitity;
	}


	public void setQuntitity(int quntitity) {
		this.quntitity = quntitity;
	}


	@Override
	public String toString() {
		return "AlcoholDTO [causesHealth=" + causesHealth + ", brandTypes=" + Arrays.toString(brandTypes) + ", owners="
				+ Arrays.toString(owners) + ", quntitity=" + quntitity + ", isCausesHealth()=" + isCausesHealth()
				+ ", getBrandTypes()=" + Arrays.toString(getBrandTypes()) + ", getOwners()="
				+ Arrays.toString(getOwners()) + ", getQuntitity()=" + getQuntitity() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
