package com.onesoft.day6;

public class UseCalculator {
public static void main(String[] args) {
	Calculator c = new Calculator();
	c.d=10;
	c.e=12;
	double ad = c.addition();
	System.out.println(ad);
	c.addition1();
	c.addition3(20, 20.45d, 34.06f);
}
}
