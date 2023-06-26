package com.onesoft.day8;

public class Human {
	String name;
	int age ;
	String gender;
	public Human(String name,
	int age ,
	String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", gender=" + gender ;
	}

}
