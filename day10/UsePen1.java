package com.onesoft.day10;

import java.util.ArrayList;

public class UsePen1 {
public static void main(String[] args) {
	Pen1 p1=new Pen1();
	p1.brand="cello";
	p1.colour="blue";
	p1.price=50;
	
	Pen1 p2=new Pen1();
	p2.brand="camlin";
	p2.colour="Red";
	p2.price=70;
	
	Pen1 p3=new Pen1();
	p3.brand="Reynolds";
	p3.colour="black";
	p3.price=73;
	
	Pen1 p4=new Pen1();
	p4.brand="apsara";
	p4.colour="green";
	p4.price=80;
	
	
	ArrayList<Pen1> pens = new ArrayList<>();
	pens.add(p1);
	pens.add(p2);
	pens.add(p3);
	pens.add(p4);
	
	pens.forEach(x->{ 
		if(x.price%2!=0) {
			System.out.println(x);
		}
		});	
System.out.println(pens);
	
	
	System.out.println(pens.get(3));
	
	System.out.println("Normal loop");
	for (int i = 0; i < pens.size(); i++) {
		
		System.out.println(pens.get(i));
		
	}
	System.out.println("FOR Enhanced ");
	for (Pen1 pen1 : pens) {
		System.out.println(pen1);
	}
	System.out.println("FOR EACH");
	pens.forEach(x->System.out.println(x));

	


	
	
	System.out.println("Print the price of the Odd");
for (int i = 0; i < pens.size(); i++) {
		
		if (pens.get(i).price%2!=0) {
			System.out.println(pens.get(i));
		}
		
	}
	
System.out.println("Print the price of the even");

for (int i = 0; i < pens.size(); i++) {
	
	if (pens.get(i).price%2==0) {
		System.out.println(pens.get(i));
	}
	
}
System.out.println("FOR ODD No");
for (Pen1 pen1 : pens) {
	if(pen1.price%2!=0) {
		System.out.println(pen1);
	}
	
}

System.out.println("Brand name StartsWith c");
for (int i = 0; i < pens.size(); i++) {
	if(pens.get(i).brand.startsWith("c")) {
		System.out.println(pens.get(i).brand);
	}
}
for (Pen1 pen1 : pens) {
	if(pen1.colour.equalsIgnoreCase("blue")) {
		System.out.println(pen1);
	}
	
}

ArrayList<Pen1> bluePens=new ArrayList<>();
for (int i = 0; i < pens.size(); i++) {
	if (pens.get(i).colour.equalsIgnoreCase("Blue")) {
		bluePens.add(pens.get(i));
		
	}
	
	
	
}
System.out.println(bluePens);
}

}
