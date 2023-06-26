package com.onesoft.day8;

public class UseBullet {
	public static void main(String[] args) {
		Bullet bu = new Bullet();
		String detail = bu.detail("Bullet");
		System.out.print(detail);
		boolean detail1 = bu.detail(10,"ShowRoom");
		System.out.print(" "+detail1);
		int detail2 = bu.detail( "Classic",250);
		System.out.print(" "+detail2);
		
	}

}
