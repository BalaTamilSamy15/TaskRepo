package com.onesoft.day7;

public class UseAC {
public static void main(String[] args) {
	Condenser c=new Condenser("Dai","Black",4500);
	AirCon a = new  AirCon("TATA","L89",23323,c);
	System.out.println(a);
}
}
