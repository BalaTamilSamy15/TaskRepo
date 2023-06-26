package com.onesoft.day9;

public class TouchLap extends Laptop {

	@Override
	public int price(String c) {
		String [] d= {"Black ","White"};
		for (int i = 0; i < d.length; i++) {
		if (c.equalsIgnoreCase(d[i])) {
			return 50000;
		}
		else if(c.equalsIgnoreCase(d[i])) {
			return 60000;
		}
		}
		return 0 ;
	}

	@Override
	public String model(String model) {
		
		return model;
	}
	

}
