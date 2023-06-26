package com.onesoft.day14;

import java.util.Optional;

public class OptionalPractice {
public static void main(String[] args) {
	String s[]= {"b","uu"};
	Optional<String[]> x = Optional.ofNullable(s);
//	if (x.isPresent()) {
//		System.out.println(s.toLowerCase());
//	}
//	else {
//		System.out.println("NullPointer Exception");
//	}
	
//	System.out.println((x. orElse("Nullpointer Exception")));
	System.out.println("Run rest");
	System.out.println(x.orElseThrow(()->new NullPointerException("Null handled")));
	System.out.println("Run rest");
	
	
	
	
	
	
}
}
