package com.onesoft.day6;

import java.util.Arrays;

public class Palin {
	String wor;

	public String paliii(String b) {
		String temp = "";
		for (int i = b.length() - 1; i >= 0; i--) {
			temp = temp + b.charAt(i);

		}

		if (temp.equals(b)) {
			return "PalinDrome";
		}
		return "Not Palindrome";

	}

	public String primeNo(int c) {
		int count = 0;
		if (c == 1 && c == 0) {
			return "Not Prime";
		} else if (c >= 2) {
			for (int i = 2; i <= c; i++) {
				if (c % i == 0) {
					count++;
				}
			}
			if (count == 1) {
				return "Prime";
			}
			return " Not Prime";
		}
		return "Not Prime";

	}

	public String reverse(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		return rev;

	}

	public int lengthFind(int[] a) {
		int l = a.length;
		return l;
	}

	public int[] fibbbi(int a) {
		int b = 0;
		int[] f = new int[a];
		int c = 1;
		int d = 0;
		if (a == 1) {
			f[a] = b;
			return f;
		} else if (a == 2) {
			f[0] = b;
			f[1] = c;
			return f;
		} else if (a >= 3) {
			f[0] = b;
			f[1] = c;
			for (int i = 2; i < f.length; i++) {

				d = b + c;
				f[i] = d;
				b = c;
				c = d;

			}
		}
		return f;
	}

	public String oddOrEven(int c) {
		if (c % 2 == 0) {
			return "Even";
		}
		return "Odd";

	}
	

	public static void main(String[] args) {
		Palin p = new Palin();
		//6
		String oddOrEven = p.oddOrEven(5);
		System.out.println(oddOrEven);
		//5
		int[] fibbbi = p.fibbbi(9);
		System.out.println(Arrays.toString(fibbbi));
		//4
		int[] a = { 12, 3, 4, 5, 5, 6 };
		int lengthFind = p.lengthFind(a);
		System.out.println(lengthFind);
		//3
		String reverse = p.reverse("RamRaja");
		System.out.println(reverse);
		//2
		String paliii = p.paliii("MOf");
		System.out.println(paliii);
		//1
		String primeNo = p.primeNo(8);
		System.out.println(primeNo);
		
		
	}
}
