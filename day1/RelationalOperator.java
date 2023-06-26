package com.onesoft.day1;

public class RelationalOperator {
	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 2;

		boolean large = num1 > num2;
		System.out.println("greater than symbols " + large);
		boolean smaller = num1 < num2;
		System.out.println("Smaller than symbols " + smaller);
		int num3 = 5;
		int num4 = 5;
		boolean greater = num3 >= num4;
		System.out.println("greater tha or equal  " + greater);
		boolean smallereq = num3 <= num2;
		System.out.println("smaller than equals " + smallereq);
		boolean equalsto = num3 == num4;
		System.out.println("both no are same  " + equalsto);
		boolean notEquals = num3 != num4;
		System.out.println("both no are not same  " + notEquals);

	}
}
