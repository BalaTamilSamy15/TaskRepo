package com.onesoft.day9;

public class EnggClg implements College  {

	@Override
	public int noOfLab() {
		
		return 3;
	}

	@Override
	public int fee(String c) {
		String [] d= {"Mech","aero","ECE"};
		
		for (int i = 0; i < d.length;i++) {
			if (c.equalsIgnoreCase(d[i])) {
			
				return 120000;
			}
			
			
		}
		return 00;
	
		
	}

	@Override
	public String name() {
		
		return "XXX college";
	}

	@Override
	public int noOfDept() {
		
		return 3;
	}

	@Override
	public int foundedYear() {
		
		return 2000;
	}
	
	

}
