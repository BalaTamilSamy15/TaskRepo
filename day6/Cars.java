package com.onesoft.day6;

import java.util.Iterator;

public class Cars {
	String brand;
	int price;
	String colour;
	int dis;

	public int findMaxPrice(int[] s) {
		int max = s[0];
		for (int i = 0; i < s.length; i++) {
			if (max < s[i]) {
				max = s[i];
			}
		}
		return max;
		
	}
	public  void findClour(Cars []a) {
	for (int i = 0; i < a.length; i++) {
		if((a[i].colour).equalsIgnoreCase("blue")) {
			System.out.println(a[i].brand+" "+a[i].colour+" "+a[i].price);
			
		}
	}

	}
	public Cars findMaxPri(Cars[] cars) {
		Cars temp= cars[0];
		for (int j = 0; j < cars.length; j++) {
			if(temp.price<cars[j].price) {
				temp=cars[j];
			}
		}
		return temp;
		

	}
}
