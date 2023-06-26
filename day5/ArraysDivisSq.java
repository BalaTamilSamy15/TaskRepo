package com.onesoft.day5;

import java.util.Iterator;

public class ArraysDivisSq {
	public static void main(String[] args) {
		int[] div = { 2, 5, 7, 15, 5, 7, 101, 103 };
		int total;
		for (int i = 0; i < div.length; i++) {
			if (div[i] % 5 == 0) {
				continue;
			}
			if (div[i] >= 100) {
				break;
			} else {
				total = div[i] * div[i];
			}
			System.out.print(total + " ");
		}

	}

}
