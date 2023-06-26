package com.onesoft.day2;

public class Calculator {
	String brand;
	int price;

	public int findAddition() {
		int a = 20, b = 5;
		return a + b;
	}

	public void findSub() {
		System.out.println(10 - 5);
	}

	public int findMulti(int a, int b) {
		return a * b;
	}

	public void findDivision(int a, float b) {
		System.out.println(a / b);

	}
}
