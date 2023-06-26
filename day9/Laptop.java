package com.onesoft.day9;

public  abstract class Laptop {
	public String  brand() {
		return "DELL";
	}
	public int ram() {
		return 8;	
	}
	public abstract int price(String c) ;
	
public abstract String   model (String  model );
}
