package com.onesoft.day8;

public class SportsCar extends Car{
	
	int cc;
	int price;
	String model;
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public SportsCar(String type, String fuel, String brand, String colour,int cc,int price,String model) {
		super(type, fuel, brand, colour);
		this.cc=cc;
		this.price=price;
		this.model=model;
	}
	@Override
	public String toString() {
		
		return super.toString()+" CC "+cc+" Price "+price+" Model "+model;
	}
}
