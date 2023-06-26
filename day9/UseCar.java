package com.onesoft.day9;

public class UseCar {
	public static void main(String[] args) {
		Car c = new Car();
		c.d = 14;
		boolean luxcuray = c.isLuxcuray();
		System.out.println(luxcuray);

		String energy = c.energy("Electric");
		System.out.println(energy);
		
		String mode = c.mode("Road");
		System.out.println(mode);
		
		int fair = c.fair(132);
		System.out.println(fair);
		
		String model = c.model("TIAGO");
		System.out.println(model);
		
		String type = c.type("Private");
		System.out.println(type);
	}

}
