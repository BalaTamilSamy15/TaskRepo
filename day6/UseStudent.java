package com.onesoft.day6;

public class UseStudent {
public static void main(String[] args) {
	Student s1 =new  Student();
	s1.tamil=89;
	s1.eng=78;
	s1.maths=98;
	s1.total=s1.findTotal();
	s1.display(10);
	s1.averageMark();
	Student s2 =new  Student();
	s2.tamil=45;
	s2.eng=67;
	s2.maths=81;
	s2.total = s2.findTotal();
	s2.display(30);
s2.averageMark();
}
}
