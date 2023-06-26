package com.onesoft.day9;

public class AC implements Electronics,HomeAppaliance  {
int orgPr;
	@Override
	public String brand() {
		return "corma";
	}

	@Override
	public int resalePrice(int yr) {
		int value=orgPr/yr;
		return value;
	}

	@Override
	public int rating(int r) {
		
		return r;
	}

}
