package com.onesoft.day7;

public class UseCar {
public static void main(String[] args) {
	Engine e =new  Engine();
	e.cc=1000;
	e.brand="ford";
	e.price=50000;
	
	Car c =new  Car();
	c.brand="Hyundai";
	c.model="i20";
	c.colour="white";
	c.price=900000;
	c.engine=e;
	System.out.println(c.brand+" "+c.model+" "+c.price+" "+c.colour+" "+c.engine.brand+" "+c.engine.cc+" "+c.engine.price);
	int total=c.price+c.engine.price;
	System.out.println(total);
}
}
