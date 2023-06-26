package com.onesoft.day9;

public class UseTouchLap {
	public static void main(String[] args) {
		TouchLap tp = new TouchLap();
		String brand = tp.brand();
		System.out.println(brand);
		int ram = tp.ram();
		System.out.println(ram);
		int price = tp.price("WhiTE");
		System.out.println(price);
		String model = tp.model("XML40");
		System.out.println(model );
	}

}
