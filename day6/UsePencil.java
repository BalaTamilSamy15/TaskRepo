package com.onesoft.day6;

public class UsePencil {
public static void main(String[] args) {
Pencil p1 = new Pencil();
p1.brand="Nataraj";
p1.colour="Red&Black";
p1.price=23;

Pencil p2 = new Pencil();
p2.brand="Camalin";
p2.colour="Red&Black";
p2.price=13;

int findHig = p1.findHig(p1.price,p2.price);
System.out.println(findHig);
}
}
