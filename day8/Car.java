package com.onesoft.day8;

public class Car extends Vehicle {
	
	String brand;
	String colour;
public void setBrand(String br) {
	brand=br;
} 
public String getBrand() {
	return brand;
	
}
public void setColour(String colour) {
	this.colour=colour;
}
public String getColour() {
	return colour;
}
public Car(String type,String fuel, String brand,String colour) {
	super(type,fuel );
	this.brand=brand;
	this.colour=colour;
	
}
@Override
public String toString() {
	
	return super.toString()+" Brand "+brand+" Colour "+colour;
}

}
