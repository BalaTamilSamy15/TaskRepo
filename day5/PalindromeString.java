package com.onesoft.day5;

import java.util.Iterator;
//Index array and with conditions
public class PalindromeString {

	public static void main(String[] args) {
		String s = "abbab";
		int l = s.length()-1;
		String re = "";
		for (int i =l; i >= 0; i--) {
			re =re +s.charAt(i) ;//b
			//a+b

		}
		System.out.println(re);
		if (s.equals(re)) {
			System.out.println("The given String is Palindrome");
		} else {
			System.out.println("The given String is not Palindrome");
		}

	}
}
