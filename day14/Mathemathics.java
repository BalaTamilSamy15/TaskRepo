package com.onesoft.day14;

public class Mathemathics {
public int max(int [] num) {
	int a=num[0];
	for (int i = 0; i < num.length; i++) {
		if(num[i]>a) {
			a=num[i];
		}
	}
	return a;
	

}
public int min(int [] num) {
	int a=num[0];
	for (int i = 0; i < num.length; i++) {
		if(num[i]<a) {
			a=num[i];
		}
	}
	return a;
	

}
}
