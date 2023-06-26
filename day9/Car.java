package com.onesoft.day9;

public class Car  extends FourWheeler {
int d;
	@Override
	public int fair(int f) {
		int t=d*f;
		return t ;
	}

	@Override
	public String type(String t) {
	
		return t;
	}

	@Override
	public boolean isLuxcuray() {
		
		return true;
	}
	public String model(String md) {
		return md;
	}

}
