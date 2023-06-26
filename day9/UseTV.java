package com.onesoft.day9;

public class UseTV {
	public static void main(String[] args) {
		TV l = new TV();
		l.brand="SSSS";
		int pr=2323;
		l.price=pr;
		
		
		boolean autoCo = l.isAutoCo(false);
		boolean wifiAccess = l.wifiAccess(true);
		String lala = l.getNetPrice(l.price, 230);
		System.out.println(l.brand+" "+l.price+"  "+autoCo+ " "+wifiAccess );
	}

}
