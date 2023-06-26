package com.onesoft.day5;

public class UseEmp {
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.empId=1;
		e1.empName="Raja";
		e1.age=23;
		e1.gender="Male";
		e1.salary=28000;
		
		Employee e2=new Employee();
		e2.empId=2;
		e2.empName="Roja";
		e2.age=25;
		e2.gender="Female";
		e2.salary=30000;
		
		Employee e3=new Employee();
		e3.empId=3;
		e3.empName="Mala";
		e3.age=31;
		e3.gender="Female";
		e3.salary=40000;
		
		Employee e4=new Employee();
		e4.empId=4;
		e4.empName="Ram";
		e4.age=45;
		e4.gender="Male";
		e4.salary=28000;
		
		Employee e5=new Employee();
		e5.empId=5;
		e5.empName="Kannan";
		e5.age=32;
		e5.gender="Male";
		e5.salary=24000;
	
		Employee[] emps = {e1,e2,e3,e4,e5};
		int total=0; 

	
	
	for (int i = 0; i < emps.length; i++) {
			total+=emps[i].salary;
			}
		System.out.println("Total salary of emp "+total);
		System.out.println((total/5)+" Avg salary");
		
	for (int i = 0; i < emps.length; i++) {
			if ((emps[i].gender).equals("Female")) {
				System.out.println(emps[i].empName);
				
			}}
	for ( int i = 0; i < emps.length; i++) {
			if ((emps[i].gender).equals("Male")) {
				System.out.println(emps[i].empName);
				
			}}
	for ( int i = 0; i < emps.length; i++) {
			if(emps[i].salary>=22000&&emps[i].salary<=50000) {
				System.out.println(emps[i].empName);
				
			}}
	Employee max1=emps[0];
	for (int i = 0; i < emps.length; i++) {
			if (max1.age<emps[i].age) {
				max1 =emps[i];
			}
	}System.out.println(max1.age+" Senior Person");
	Employee max=emps[0];
	for ( int i = 0; i < emps.length; i++) {
			if (max.salary<emps[i].salary) {
				max=emps[i];
				
			}
			}System.out.println(max.empName+" MaxSalary"); 
			Employee min=emps[0];
	for (int  i = 0; i < emps.length; i++) {
			if (min.salary>emps[i].salary) {
				min=emps[i];
			}
			}System.out.println(min.empName+" Min salary");
		
		
		
		
		
	
	}

}
