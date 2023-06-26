package com.onesoft.day5;

import java.util.Arrays;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.price = 7000000;
		c1.brand = "Audii";
		c1.colour = "red";

		Car c2 = new Car();
		c2.price = 3000000;
		c2.brand = "BMW";
		c2.colour = "red";

		Car c3 = new Car();
		c3.price = 2000000;
		c3.brand = "HONDA";
		c3.colour = "red";
		
		Car c4 = new Car();
		c4.price = 2000000;
		c4.brand = "Benz";
		c4.colour = "Black";
		
		Car c5 = new Car();
		c5.price = 200000;
		c5.brand = "Ford";
		c5.colour = "red";
		
		Car c6 = new Car();
		c6.price = 1000000;
		c6.brand = "RolesRayols";
		c6.colour = "black";
		
		Car c7= new Car();
		c7.price = 200000;
		c7.brand = "TaTa";
		c7.colour = "red";
		
		Car c8 = new Car();
		c8.price = 200000;
		c8.brand = "Maruti";
		c8.colour = "red";
		
		Car c9 = new Car();
		c9.price = 20000;
		c9.brand = "Hyundai";
		c9.colour = "black";
		
		Car c10 = new Car();
		c10.price = 1001000;
		c10.brand = "DDD";
		c10.colour = "black";
Car[]car= {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
		Car maxPrice=car[0];
		Car minPrice=car[0];
		for (int i = 0; i < car.length; i++) {
			if (minPrice.price>car[i].price) {
				minPrice=car[i];
			}
		}
		System.out.println("Min value of car");
		System.out.println(minPrice.brand);
		System.out.println("");
		
		for (int i = 0; i < car.length; i++) {
			if(maxPrice.price<car[i].price) {
				maxPrice=car[i];
			}
		}
		System.out.println(maxPrice.brand);
		System.out.println("");
		System.out.println("car Brand  name black color");
		System.out.println("");
		for (int i = 0; i < car.length; i++) {
			if ((car[i].colour).equalsIgnoreCase("black")) {
				System.out.println(car[i].brand);
				
			}
		}
	}}

