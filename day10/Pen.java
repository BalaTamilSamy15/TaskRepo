package com.onesoft.day10;

import java.util.ArrayList;

public class Pen {
	public static void main(String[] args) {
		ArrayList<Integer> prices=new ArrayList<>();
		prices.add(20);
		prices.add(40);
		prices.add(80);
		prices.add(25);
		
		
		System.out.println(prices);
		for (int i = 0; i < prices.size(); i++) {
			System.out.println(prices.get(i));
		}
		
		System.out.println("for each");
		
		for (Integer i : prices) {
			System.out.println(i);
		}
		int max=0;
		for (Integer in : prices) {
			if(max<in) {
				max=in;
			}
			
		}
		System.out.println(" max value  "+max);
		
		
		
		
		
	}

}
