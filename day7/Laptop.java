package com.onesoft.day7;

public class Laptop {
	private String brand;
	private int price;
	private String model;
	private String colour;
	private Battery battery;
	
	public void setBattery(Battery bat) {
		this.battery=bat;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	} 
	public int getPrice() {
		return price;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setColour(String colour) {
		this.colour=colour;
	}
	public String getColour() {
		return colour;
	}

}
