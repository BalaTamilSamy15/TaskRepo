package com.onesoft.day7;

public class Condenser {
	String brand;
	int price;
	String colour;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int setPrice() {
		return price;	
	}
	public void setColour(String col ) {
		colour=col;
	}
public 	Condenser(String brand, String colour, int price){
		this.brand=brand;
		this.colour=colour;
		this.price=price;
	}
@Override
public String toString() {
	
	return brand+" "+colour+" "+price;
}
}
