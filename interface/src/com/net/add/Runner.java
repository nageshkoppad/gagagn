package com.net.add;

import com.net.add.childclass.Student;
import com.net.add.parentclass.School;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		School student=new Student();
		student.timing();
		student.fees();
		System.out.println("school open & close timing ="+ student.timing());
		System.out.println("school fees ="+student.fees());
	}

}
