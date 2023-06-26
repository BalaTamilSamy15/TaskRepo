package com.onesoft.day6;

public class UseCar {
	public static void main(String[] args) {
		Car c1= new Car();
		c1.brand="Bmw";
		c1.color="Red";
		c1.price=2300000;
		c1.disPer=(20/100f);
		c1.netPrice=c1.findNet();
		c1.display();
		Car c2= new Car();
		c2.brand="Audii";
		c2.color="Black";
		c2.price=3000000;
		c2.disPer=(33/100f);
		c2.netPrice=c2.findNet();
		c2.display();
		Car c3= new Car();
		c3.brand="RollsRoyal";
		c3.color="Marun";
		c3.price=40000000;
		c3.disPer=(12/100f);
		c3.netPrice=c3.findNet();
		c3.display();
	}

}
