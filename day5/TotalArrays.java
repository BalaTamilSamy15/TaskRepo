package com.onesoft.day5;

public class TotalArrays {
public static void main(String[] args) {
	int[] nums= {4,5,6,7};
	int add=0;
	
	for (int i = 0; i < nums.length; i++) {
		add=nums[i]+add;
	}
	System.out.println(add);
}
}
