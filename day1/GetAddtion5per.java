package com.onesoft.day1;

import java.util.Scanner;

public class GetAddtion5per {
	public static void main(String[] args) {
		Scanner getThe = new Scanner(System.in);
		System.out.println("Enter the Given product price ");
		int price = getThe.nextInt();
		float v = 5 / 100f;
		float avg = price * v + price;
		System.out.println(" add of 5% price is " + avg);

	}
}
