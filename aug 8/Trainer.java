class Trainer
{
	String name;
	long contactNo;
	int exp;
	Gender sex;
	
  Trainer(String name,long contactNo,int exp)
  {
		this.name=name;
		this.contactNo=contactNo;
		this.exp=exp; 
  }	
  void setGender(Gender sex)
  {
	  this.sex=sex;
	 System.out.println(Gender.sex.value); 
  }
  
}