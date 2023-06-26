package com.onesoft.day6;

public class StringLower {
	public static void main(String[] args) {
		String n="DaTaTYpes";
		int count=0,countL=0;
	char[] u = n.toCharArray();
char []m=n.toUpperCase().toCharArray();
for (int i = 0; i < m.length; i++) {
	if(u[i]==m[i]) {
		count++;
		}
	else {
	countL++;
	}
}

System.out.println(count);
System.out.println(countL);
}
}
