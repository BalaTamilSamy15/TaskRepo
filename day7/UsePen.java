package com.onesoft.day7;

public class UsePen {
	public static void main(String[] args) {
		Pen c1 = new  Pen("Nat","Red",12);
		Pen c2 = new  Pen("Cam","Black",12);
		Pen c3 = new  Pen("Apsra","Yellow",13);
		Pen [] c= {c1,c2,c3};
		for (int i = 0; i < c.length; i++) {

System.out.println(c[i]);
			
		}
	}

}
