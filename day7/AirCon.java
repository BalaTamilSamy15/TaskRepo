package com.onesoft.day7;

public class AirCon {
	private String brand ;
	private String model;
	private int price; 
    private Condenser condenser;
    
    public void setBrand(String brand) {
    	this.brand=brand;
    }
    public String getBrand() {
    	return brand;
    }
    public void setModel(String model) {
    	this.model=model;
    }
    public String getModel() {
    	return model; 
    }
    public void setPrice(int price) {
    	this.price=price;
    }
    public int getPrice() {
		return price;
    }
    public void setCondenser(Condenser con) {
    	this.condenser=con;
    }
    public Condenser getCondenser() {
		return condenser;
    }
  public  AirCon(String brand, String model, int price, Condenser condenser) {
    	this.brand=brand;
    	this.model=model;
    	this.price=price;
    	this.condenser=condenser;
    }
    public String toString() {
		return brand+" "+model+" "+price+" "+condenser;

	}
}
