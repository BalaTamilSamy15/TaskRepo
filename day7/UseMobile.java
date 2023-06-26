package com.onesoft.day7;

public class UseMobile {
public static void main(String[] args) {
	Mobile m = new Mobile("Mi",8,64,12000,"White");
	m.setBrand("redmi");
	m.setColour("Red");
	System.out.println(m.getBrand()+" "+m.getColour()+" "+m.getMemory()+" "+m.getRam()+" "+m.getPrice());
System.out.println(m);
}
}
