package com.onesoft.day5;

import java.util.Iterator;

public class Fibnoncai {
public static void main(String[] args) {
	int a=0;
	int b=1; 
	int c=0;
	int nums=4;
	int total=0;
	int d=a+b;

	 System.out.println(a); System.out.println(b);
	 
	
	for (int i = 2; i <= nums; i++) {
		c=a+b;
		a=b;
		b=c;
		total=c+total;
		System.out.println(c);
		
	}
	System.out.println(" total");
	System.out.println(d+total);
	
	
	
	
	
	// 2nd question 97 and 3;
	int num=97;
	int time=3;
	for (int i = num; i < num+3; i++) {
		System.out.println(i);
		
	}
	
	// 3rd question if give nums =2 means print 2 times
	int nu= 2;
	for (int i = 0; i < nu; i++) {
		System.out.println(nu);
		
	}
	// 
	
	
	//am and pm  Question 
	int time1 =4;
	for (int i = time1; i ==time1; i++) {
		if(i<12&&i<24) {
			System.out.println("am");
		}
		else {
			System.out.println("pm");
		}
		
	}
}

}
