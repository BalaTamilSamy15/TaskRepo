package com.onesoft.day5;

public class ArraysDivi7 {
	public static void main(String[] args) {
	int[] nums= {3,7,14,21,84,56,49}; 
	int count=0,total=0;
	for (int i = 0; i < nums.length; i++) {
		if(nums[i]%7==0) {
			count++;
			total=total+nums[i];
			
		}
		
	}
	System.out.println("Total value of 7 div  "+total+" Non of count "+count);

}
}