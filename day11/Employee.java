package com.onesoft.day11;

public class Employee {
	int id;
	String name;
	int age;
	String gender;
	long salary;
	String designation;
int noOfYearExp;

// Employee e;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setNoOfYearExp(int no) {
		noOfYearExp=no;
	}
	public int getNoOfYearExp() {
		return noOfYearExp;
	}

	
		

	public Employee(int id, String name, int age, String gender, long salary, String designation, int noOfYearExp) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.designation = designation;
		this.noOfYearExp = noOfYearExp;
	}

	/*
	 * public Employee createObj() { if(e==null) { e=new Employee(id, name, age,
	 * gender, salary, designation, noOfYearExp); } return e;
	 * 
	 * }
	 */
	public String toString() {
		return "Emp Id "+id+", Name "+name+",Age "+age+", Gender "+gender+", Salary "+salary+", Designation "+designation+",No Of Year Exp "+noOfYearExp;
	}
}
