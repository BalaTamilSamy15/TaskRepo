package com.onesoft.day2;
// use the bean class
public class UseMarker {
public static void main(String[] args) {
	Marker m1=new Marker();
	m1.colour="red";
	m1.height=10;
	m1.brand="camlin";
	m1.price=50;
	System.out.println(m1.colour+" "+m1.height+" "+m1.brand+" "+m1.price);
	Marker m2=new Marker();
	m2.colour="yellow";
	m2.height=11;
	m2.brand="Natraj";
	m2.price=70;
	System.out.println(m2.colour+" "+m2.height+" "+m2.brand+" "+m2.price);
}
}
