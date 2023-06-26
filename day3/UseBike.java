package com.onesoft.day3;

public class UseBike {
public static void main(String[] args) {
	Bike b =new Bike();
	String[]x=args[0].split("-");
	b.bikeBrand=x[0].toUpperCase();
	b.bikePrice=Integer.parseInt(x[1]);
	b.bikeColour=x[2];
	System.out.println(b.bikeBrand);
	Bike c =new Bike();
	String[]y=args[1].split("-");
	c.bikeBrand=y[0].toUpperCase();
	c.bikeColour=y[2];
	c.bikePrice=Integer.parseInt(y[1]);
	System.out.println(c.bikeBrand);
	Bike d=new Bike();
String[]z=args[2].split("-");
d.bikeBrand=z[0].toUpperCase();
d.bikeColour=z[2];
d.bikePrice=Integer.parseInt(z[1]);
	System.out.println(d.bikeBrand);
}
}
