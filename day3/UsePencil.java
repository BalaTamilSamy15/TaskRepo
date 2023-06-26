package com.onesoft.day3;

public class UsePencil {
public static void main(String[] args) {
	//Apsra,50,white,10 Natraj,80,red,20 Camlin,70,Green,10
	Pencil p = new Pencil();
	String[]a=args[0].split(",");
	p.brand=a[0];
	p.price=Integer.parseInt(a[1]);
	p.colour=a[2];
	p.discount=Integer.parseInt(a[3]);
	p.netPrice=p.price-p.discount;
	System.out.println(p.brand+" "+p.price+" "+p.colour+" "+p.discount+" "+p.netPrice);
	Pencil p1=new Pencil();
	String[]b=args[1].split(",");
	p1.brand=b[0];
	p1.price=Integer.parseInt(b[1]);
	p1.colour=b[2];
	p1.discount=Integer.parseInt(b[3]);
	p1.netPrice=p1.price-p1.discount;
	System.out.println(p1.brand+" "+p1.price+" "+p1.colour+" "+p1.discount+" "+p1.netPrice);
	Pencil p2=new Pencil();
	String[]c=args[1].split(",");
	p2.brand=c[0];
	p2.price=Integer.parseInt(c[1]);
	p2.colour=c[2];
	p2.discount=Integer.parseInt(c[3]);
	p2.netPrice=p2.price-p2.discount;
	System.out.println(p2.brand+" "+p2.price+" "+p2.colour+" "+p2.discount+" "+p2.netPrice);
}
}
