package com.onesoft.day14;

public class UseMath {
	public static void main(String[] args) {
		int[] n = { 24, 56, 78, 98, 3 };

		Mathemathics maths = new Mathemathics();

		Math maxi = maths::max;
		System.out.println(maxi.find(n));

		Math minii = maths::min;
		System.out.println(minii.find(n));
	}
}
