package com.onesoft.day10;

import java.util.ArrayList;

public class Name {
	public static void main(String[] args) {
		ArrayList<String > st= new ArrayList<>(); 
		st.add("Bala");
		st.add("Ram");
		st.add("Adhi");
		st.add("Mala");
		st.add("Ramu");
		st.add("Adhiii");
		System.out.println(st);
		String s=st.get(0);
		for (String sa : st) {
			if(s.length()<sa.length()) {
	              s=sa;
				
			}
		
		}
		System.out.println(s);
		}
		
	}


