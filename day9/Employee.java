package com.onesoft.day9;

import java.util.ArrayList;

public class Employee {
	public static void main(String[] args) {
		ArrayList<Integer>li=new ArrayList<>();
		li.add(20);
		li.add(10);
		li.add(50);
		li.add(75);
		li.add(80);
		li.add(50);
		System.out.println(li);
		System.out.println(li.get(3));
		int size = li.size();
		System.out.println(size);
		Integer remove = li.remove(4);
		System.out.println(remove);
	    li.set(4, 100);
	    System.out.println(li);
	
	}

}
