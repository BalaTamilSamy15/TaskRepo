package com.onesoft.day7;

public class Battery {
	private String brand;
	private String model;
	private int  capacity;
	private int price;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public  String getBrand() {
		return brand;
	}
	public void setmodel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setCapacity(int cap) {
		this.capacity=cap;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}

}
