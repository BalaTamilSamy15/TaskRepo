package com.onesoft.day9;

public class UseEngg {
	public static void main(String[] args) {
		EnggClg ec=new  EnggClg();
		int noOfDept = ec.noOfDept();
		System.out.println(noOfDept);
		int fee = ec.fee("Aero");
		System.out.println(fee);
		
		int noOfLab = ec.noOfLab();
		System.out.println(noOfLab);
		String name = ec.name();
		System.out.println(name);
		int foundedYear = ec.foundedYear();
		System.out.println(foundedYear);
	}

}
