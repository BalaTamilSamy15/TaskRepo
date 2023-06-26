package com.onesoft.day8;

public class Vehicle {
	String type;
	String fuel;
	public void setType(String ty) {
		type=ty;
	}
	public String getType() {
		return type;
	}
	public void setFuel(String f) {
		fuel=f;
	}
	public Vehicle(String type,String f) {
		this.type=type;
		fuel=f;
	}
	@Override
	public String toString() {
		
		return "Type "+type+" Fuel "+type;
	}

}
