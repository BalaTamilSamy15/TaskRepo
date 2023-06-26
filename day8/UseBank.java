package com.onesoft.day8;

public class UseBank {
	public static void main(String[] args) {
		BanK1 b = new BanK1();
		int findLoan = b.findLoan("ram");
		System.out.println(findLoan);
		int findLoan2 = b.findLoan("Raja", 50000);
		System.out.println(findLoan2);
		int findLoan3 = b.findLoan(50000,4);
		System.out.println(findLoan3);
	}

}
