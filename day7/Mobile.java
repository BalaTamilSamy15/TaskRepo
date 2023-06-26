package com.onesoft.day7;

public class Mobile {
	private String brand;
	private int ram;
	private int memory;
	private int price;
	private String colour;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRam() {
		return ram;
	}
	public void setMemory(int mem) {
		this.memory=mem;
	}
	public int getMemory() {
		return memory;
	}
	public void setPrice(int price) {
		this.price=price;	
	}
    public int getPrice() {
	return price;
}
    public void setColour(String col) {
    	this.colour=col;
    }
    public String getColour() {
    	return colour;
    }
	public Mobile(String brand, int ram, int mem, int price, String col) {
		this.brand = brand;
		this.ram = ram;
		this.memory = mem;
		this.price = price;
		this.colour = col;
	}
	@Override
	public String toString() {
		
		return "Brand = "+brand+" ,Price = "+price+",  Mem = "+memory+", Col =  "+colour+" ,Ram = "+ram;
	}

}
