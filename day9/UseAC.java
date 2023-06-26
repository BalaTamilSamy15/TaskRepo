package com.onesoft.day9;

public interface UseAC {
	public static void main(String[] args) {
		AC ac = new AC();
		ac.orgPr=20000;
		String brand = ac.brand();
		System.out.println(brand);
		int rating = ac.rating(3);
		System.out.println(rating);
		int re = ac.resalePrice(4);
		System.out.println(re);
	}

}
