package com.onesoft.day8;

public class JavaTeacher extends Teacher {
 String sub;
 String des;
 int id;
 
public JavaTeacher(String name, String qualification, int age, String sub, String des, int id) {
	super(name, qualification, age);
	this.sub = sub;
	this.des = des;
	this.id = id;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ "sub "+sub+" des "+des+" id "+id;
	}
}

