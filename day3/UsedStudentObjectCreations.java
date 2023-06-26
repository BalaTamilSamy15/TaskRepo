package com.onesoft.day3;

import java.util.Arrays;

public class UsedStudentObjectCreations {
	public static void main(String[] args) {
		Student s1=new Student();
		String[] a = args[0].split(",");
		s1.name=a[0];
		s1.age=Integer.parseInt(a[1]);
		s1.isBoy=Boolean.parseBoolean(a[2]);
		
		System.out.println(Arrays.toString(a));

		Student s2=new Student();
		String[] b = args[1].split(",");
		s2.name=b[0];
		s2.age=Integer.parseInt(b[1]);
		s2.isBoy=Boolean.parseBoolean(b[2]);
		
		System.out.println(Arrays.toString(b));
		
	}

}
