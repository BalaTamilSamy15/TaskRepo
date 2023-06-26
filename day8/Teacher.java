package com.onesoft.day8;

public class Teacher {
	String name;
	String qualification;
	int age;
	public Teacher(String name, String qualification, int age) {
		
		this.name = name;
		this.qualification = qualification;
		this.age = age;
	}
	@Override
	public String toString() {
		return "name=" + name + ", qualification=" + qualification + ", age=" + age ;
	}
	
	

}

