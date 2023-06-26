package com.onesoft.day1.test1;

public class AdditionOf2 {

	public static void main(String[] args) {
	int a=1, b=2, c=a+b;
	System.out.println(c);
	// long difference
	long num1=2, num2=5, diff=num2-num1;
	System.out.println(diff);
	
	//Find the area
	int rad=2;
	int area= (int) ((rad*rad)*3.14);
	System.out.println(area);
	
	//Product of two
	double a1=123.4d,b1=27.78d,pro=a1*b1;
	System.out.println(pro+"   product of the two value");
	
	//age above 18 or not 
	int age =12;
	System.out.println(age>=18);
	
	//cube of the three values 
	int ab=2, aCube=ab*ab*ab;
	System.out.println(aCube);
	int ab1=2, bCube=ab1*ab1*ab1;
	System.out.println(bCube);
	int ac=2, cCube=ac*ac*ac;
	System.out.println(cCube);

	//char join the characters 
	char q='x', w='y';
	System.out.println(q+""+w);
	
	// page 17 in lms
	int m=2,n=3,fn =(m-n)*(m-n);
	System.out.println(fn);
	
	//oneSoft String Question
	 
	String st="OneSoft Technologies " 
			+ "is the good place to "
			+ "learn java";
	System.out.println(st);
	String concat = st.concat(" Good");
	System.out.println(concat);
	
	
	// char 3 concat
	char x='a',y='b',z='c';
	System.out.println(x+""+y+""+z);
	
	// Student Name with initial
	String ste = "xxx";
	char rr='y';
	System.out.println(rr+"."+ste);
	}

}
