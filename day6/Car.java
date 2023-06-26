package com.onesoft.day6;

public class Car {
String brand;
int price;
String color;
float disPer;
float netPrice;

public float findNet() {
	return price-(price*(disPer));
}
public void display() {
	System.out.println(brand+" "+price+" "+color+" "+disPer+" "+netPrice);

}
}
