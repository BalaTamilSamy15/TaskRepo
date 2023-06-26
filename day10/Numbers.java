package com.onesoft.day10;

import java.util.ArrayList;

public class Numbers {
public static void main(String[] args) {
	ArrayList<Integer> nu=new ArrayList<>();
	nu.add(123);
	nu.add(234);
	nu.add(124);
	nu.add(136);
	nu.add(125);
	nu.add(238);
	nu.add(128);
	nu.add(234);
	
for (Integer i : nu) {
	if (i%2!=0) {
		System.out.println(i);
		
	}
	
	
}


System.out.println("For each method");

System.out.println("               ");

nu.forEach(no-> {
	int max=0;
if(max<no) {
	max=no;
}

System.out.println(max);
});

}
}
