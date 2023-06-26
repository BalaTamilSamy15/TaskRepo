package com.onesoft.day8;

public class Bullet {
	int serviceCharge=5000;
	int tax=2456;
	public String detail(String name) {
		return "Requirements";
	}
	public boolean detail(int cap,String delivery ) {
		return true;
	}
	public int detail(String model,int cc) {
		return 250000+tax+serviceCharge;
	}
}
