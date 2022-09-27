package com.zworkz.web;

public class JobDTO {
	private String name;
    private String email;
    private String no;
    private String no1;
    private String gender;
    private String quali;
    private String passout;
    private String university;
    private String adress;
    private String skills;
    private String salary;
    private String exp;
    private String idProof;
    private String proof;
     
    public JobDTO() {
		System.out.println("calling default const");
	}

	public JobDTO(String name, String email, String no, String no1, String gender, String quali, String passout,
			String university, String adress, String skills, String salary, String exp, String idProof, String proof) {
		
		this.name = name;
		this.email = email;
		this.no = no;
		this.no1 = no1;
		this.gender = gender;
		this.quali = quali;
		this.passout = passout;
		this.university = university;
		this.adress = adress;
		this.skills = skills;
		this.salary = salary;
		this.exp = exp;
		this.idProof = idProof;
		this.proof = proof;
	}

	@Override
	public String toString() {
		return "JobDTO [name=" + name + ", email=" + email + ",Phone no=" + no + ",Phone no1=" + no1 + ", gender=" + gender
				+ ", Qualification=" + quali + ", passout=" + passout + ", university=" + university + ", adress=" + adress
				+ ", skills=" + skills + ", salary=" + salary + ", exp=" + exp + ", idProof=" + idProof + ", proof="
				+ proof + "]";
	}

}
