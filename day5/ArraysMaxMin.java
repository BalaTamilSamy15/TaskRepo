package com.onesoft.day5;

public class ArraysMaxMin {
public static void main(String[] args) {
	int []nums= {21,36,78,9,11};
	int max = nums[0]; 
	for (int i = 0; i < nums.length; i++) {
		if (nums[i]>max) {
			max=nums[i];
		} 
		
	}
	int min  = nums[0];
	for (int i = 0; i < nums.length; i++) {
		if(nums[i]<min) {
			min=nums[i]; //min=21
		}
		
	}
	System.out.println(min);
			System.out.println(max);
}
}
