package com.onesoft.day6;

public class Student {
	int tamil;
	int eng;
	int maths;
int total; 
	public int findTotal() {
		return tamil+eng+maths;

	}
	public void display(int a) {
		System.out.println(tamil+" "+eng+" "+maths+" "+(total+a));
	}
public void averageMark() {
		int avg=total/3;
		System.out.println(avg);
	}

}
