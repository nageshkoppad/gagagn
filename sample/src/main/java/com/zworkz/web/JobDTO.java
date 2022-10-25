package com.zworkz.web;

public class JobDTO {
	private String name;
    private String email;
    private String phoneNo1;
    private String phoneNo2;
    private String gender;
    private String qualification;
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

	public JobDTO(String name, String email, String phoneNo1, String phoneNo2, String gender, String qualification, String passout,
			String university, String adress, String skills, String salary, String exp, String idProof, String proof) {
		
		this.name = name;
		this.email = email;
		this.phoneNo1 = phoneNo1;
		this.phoneNo2 = phoneNo2;
		this.gender = gender;
		this.qualification = qualification;
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
		return "JobDTO [name=" + name + ", email=" + email + ", phoneNo2=" + phoneNo1 + ", phoneNo2=" + phoneNo2 + ", gender=" + gender
				+ ", qualification=" + qualification + ", passout=" + passout + ", university=" + university + ", adress=" + adress
				+ ", skills=" + skills + ", salary=" + salary + ", exp=" + exp + ", idProof=" + idProof + ", proof="
				+ proof + "]";
	}

}
