package com.onesoft.day10;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student student1 = new  Student();
		student1.name="Ram";
		student1.age=18;
		student1.isMale=true;
		student1.marks=560;
		
		Student student2 = new  Student();
		student2.name="Somu";
		student2.age=19;
		student2.isMale=true;
		student2.marks=570;
		
		Student student3 = new  Student();
		student3.name="Renu";
		student3.age=18;
		student3.isMale=false;
		student3.marks=580;
		
		Student student4 = new  Student();
		student4.name="Vanu";
		student4.age=19;
		student4.isMale=false;
		student4.marks=590;
		
		Student student5 = new  Student();
		student5.name="Raju";
		student5.age=18;
		student5.isMale=true;
		student5.marks=560;
		
		Student student6 = new  Student();
		student6.name="Ram";
		student6.age=18;
		student6.isMale=true;
		student6.marks=560;
		
		Student student7 = new  Student();
		student7.name="Veer";
		student7.age=18;
		student7.isMale=true;
		student7.marks=560;
		
		
		ArrayList<Student> studentDetails =new ArrayList<>();
		studentDetails.add(student1);
		studentDetails.add(student2);
		studentDetails.add(student3);
		studentDetails.add(student4);
		studentDetails.add(student5);
		studentDetails.add(student6);
		studentDetails.add(student7);
		
		ArrayList<Student> boyDetails =new ArrayList<>();
		
		for (Student student : studentDetails) {
			if(student.isMale) {
				boyDetails.add(student);
			}
			
		}
		System.out.println("Boys Only"+boyDetails);
		
		ArrayList<Student> girlDetails =new ArrayList<>();
		
		for (Student student : studentDetails) {
			if(student.isMale==false) {
				girlDetails.add(student);
			}
			
		}
		System.out.println("Girls Only"+girlDetails);
	}

}
