package com.onesoft.day6;

public class UseCars {
	public static void main(String[] args) {

Cars c1 = new Cars();
c1.brand="BMW";
c1.colour="blue";
c1.price=2334567;
c1.dis=3476;
Cars c2 = new Cars();
c2.brand="BMW";
c2.colour="red";
c2.price=2334567;
c2.dis=3453;

Cars c3 = new Cars();
c3.brand="BMW";
c3.colour="Blue";
c3.price=2334567;
c3.dis=3496;

Cars c4 = new Cars();
c4.brand="BMW";
c4.colour="red";
c4.price=2334567;
c4.dis=3416;

/*
 * int [] prices= {c1.price,c2.price,c3.price,c4.price}; int findMaxPrice =
 * c1.findMaxPrice(prices); System.out.println(findMaxPrice);
 * 
 * int [] diss= {c1.dis,c2.dis,c3.dis,c4.dis}; int maxDis =
 * c3.findMaxPrice(diss); System.out.println(maxDis);
 */
Cars [] cars= {c1,c2,c3,c4};
c1.findClour(cars);
Cars findMaxPri = c2.findMaxPri(cars);
System.out.println();

	}
}
