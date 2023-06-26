package com.onesoft.day6;

public class UseBike {
public static void main(String[] args) {
	Bike b1 = new Bike();
	b1.brand="Duccati";
	b1.colour="black";
	b1.price=13267876;
	
	Bike b2 = new Bike();
	b2.brand="BMW";
	b2.colour="REd";
	b2.price=13267876;

	Bike b3 = new Bike();
	b3.brand="Ninja";
	b3.colour="black";
	b3.price=678788768;

	Bike b4 = new Bike();
	b4.brand="Duccati";
	b4.colour="Red";
	b4.price=132654876;
 Bike[] bikes= {b1,b2,b3,b4};
 String findMaxPrice = b1.findMaxPrice(bikes);
 System.out.println(findMaxPrice);
}
}
