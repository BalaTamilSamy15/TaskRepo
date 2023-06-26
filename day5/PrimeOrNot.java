package com.onesoft.day5;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		System.out.println("Enter the No ");
		Scanner sc =new  Scanner(System.in);
		int n = sc.nextInt();
		
		int count=0;
			if(n==1||n==0 ) {
				System.out.println("Not Prime No");
			}
			else {
				
				for (int i = 2; i<=n; i++) {
					if(n%i==0) {
						count++;
					}
			}
			if(count==1) {
				System.out.println("Prime No");
			} else {
				System.out.println("Not Prime No");
			}
		}
	}

}
