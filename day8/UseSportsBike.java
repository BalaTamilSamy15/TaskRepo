package com.onesoft.day8;

public class UseSportsBike {
public static void main(String[] args) {
	SportsBike sp = new  SportsBike();
	sp.brand="Yamaha";
	sp.price=1211212;
	sp.rating=4;
	String model = sp.model();
	System.out.println(model);
	int speed = sp.speed();
	System.out.println(speed);
}
}
