package com.onesoft.day9;

import java.util.ArrayList;

public class Student {
	public static void main(String[] args) {
		ArrayList<Integer> st=new ArrayList<>();
		st.add(100);
		st.add(80);
		st.add(70);
		st.add(60);
		st.add(30);
		st.add(45);
		st.add(37);
		st.add(40);
		st.add(50);
		st.add(75);
		System.out.println(st);
		
		int max=0;
		for (Integer in : st) {
			if(max<in) {
				max=in;
			}
			
		}
		System.out.println(max);
		
	}

}
