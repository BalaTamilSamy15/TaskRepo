package com.onesoft.day7;

public class UseLaptop {
	public static void main(String[] args) {
		Battery b=new Battery();
		b.setBrand("Mi");
		b.setCapacity(2000);
		b.setmodel("YR67");
		b.setPrice(1500);
		
	Laptop l =new  Laptop();
	l.setBrand("Lenovo");
	l.setColour("Black");
	l.setPrice(70000);
	l.setModel("L40");
	l.setBattery(b);
	
	System.out.println(l.getBrand()+" "+l.getColour()+" "+l.getPrice()+" "+l.getModel()+" "+l.getBattery().getBrand()+" "+l.getBattery().getCapacity()+" "+l.getBattery().getModel()+" "+l.getBattery().getPrice());
	System.out.println(l.getPrice()+l.getBattery().getPrice());
	
	}

}
