package com.onesoft.day9;

public abstract class FourWheeler implements Transport {
	public String mode(String m) {
		return m;
	}
	@Override
	public String energy(String e) {
		
		return e;
	}
	public abstract  boolean isLuxcuray ();

}
