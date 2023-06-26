package com.onesoft.day2;

public class PriceOfCar {
public static void main(String[] args) {
	CarBp car = new CarBp();
	car.brand="Benz";
	car.price=500000f;
	car.colour="white";
	car.discount=10.00f;
	car.netAmount=car.price-car.price*(car.discount/100);
	System.out.println(car.netAmount);
	car.tax=25.00f;
car.netAmtTax=car.netAmount+car.netAmount*(car.tax/100);
System.out.println(car.netAmtTax);
}
}
