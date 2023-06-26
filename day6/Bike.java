package com.onesoft.day6;

public class Bike {
String brand;
String colour;
int price;

public  String findMaxPrice(Bike [] b) {
	Bike max=b[0];
	for (int i = 0; i < b.length; i++) {
		if(max.price<b[i].price) {
			max=b[i];
		}
	}
	
	if((max.colour).equalsIgnoreCase("black")) {
		return max.colour;
	}
	return "Not available this colour";
	
	

}
}
