package com.onesoft.day2;

public class UseCalculator {
public static void main(String[] args) {
	Calculator c1 = new Calculator();
	c1.brand="Casio";
	c1.price=200;
	int total = c1.findAddition();
	System.out.println(total);
	c1.findSub();
	int findMulti = c1.findMulti(2, 4);
	System.out.println(findMulti);
	c1.findDivision(10, 5.3f);
	
}
}
