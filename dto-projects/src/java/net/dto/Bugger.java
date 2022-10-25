package java.net.dto;

public class Bugger {

	public static void main(String[] args) {
	  
		AlcoholDTO nk=new AlcoholDTO();
		nk.setCausesHealth(true);
		String[] brandName={"king fisher","red bull"};
		nk.setBrandTypes(brandName);
		String[] nuk= {"vijay mallya","nagesh"};
		nk.setOwners(nuk);
		nk.setQuntitity(120);	
		AlcoholDAO mk=new AlcoholDAOImplementor();
		mk.creat(nk);
			
		
	
	}

}
