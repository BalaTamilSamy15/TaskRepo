package com.onesoft.day8;

public class Employee  extends Human{
int id;
int salary;
String designation;
public Employee(String name,int age,String gender,int id,int salary,String designation) {
	super(name,age,gender);
	this.id=id;
	this.salary=salary;
	this.designation=designation;
	
}
@Override
public String toString() {
	return super.toString()+"id=" + id + ", salary=" + salary + ", designation=" + designation ;

}
}
