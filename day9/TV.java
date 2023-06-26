package com.onesoft.day9;

public class TV  implements SmartTV {

	String brand;
	int price;
	@Override
	public boolean wifiAccess(boolean isAccess) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAutoCo(boolean isCool) {
		// TODO Auto-generated method stub
		return true;
	}
	
public String getNetPrice(int price,int deliveryCharge) {
	return "Allow to Purchase";
		// TODO Auto-generated method stub

	}

}
