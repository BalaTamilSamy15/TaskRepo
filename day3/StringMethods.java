package com.onesoft.day3;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		String wr="Ramraja";
		// toupper() methods
		String upper = wr.toUpperCase();
		System.out.println(upper);
		//toLowercase()
		String lower = wr.toLowerCase();
		System.out.println(lower);
		//length()
		int leng = wr.length();
		System.out.println(leng);
		//concat()
		String con = wr.concat(" Father");
		System.out.println(con);
		//contains()
		boolean cn = wr.contains("raja");
		System.out.println(cn);
		//StratsWith()
		boolean startsWith = wr.startsWith("Ra");
		System.out.println(startsWith);
		//endsWith()
		boolean endsWith = wr.endsWith("ja");
		System.out.println(endsWith);
		//equals
		boolean equals = wr.equals("Ramraja");
		System.out.println(equals);
		//egualsIgnoreCase()
		boolean equalsIgnoreCase = wr.equalsIgnoreCase("ramraja");
		System.out.println(equalsIgnoreCase);
		//charAt()
		char charAt = wr.charAt(3);
		System.out.println(charAt);
		//indexof() given char or words check return boolean type
		int indexOf = wr.indexOf("R");
		System.out.println(indexOf);
		//subString()
		String substring = wr.substring(0, 3);
		System.out.println(substring);
		//toCharArray()
        char[] ch = wr.toCharArray();	
        System.out.println(ch);
        String[] split = wr.split("a");
        System.out.println(Arrays.toString(split));
		
	}

}
