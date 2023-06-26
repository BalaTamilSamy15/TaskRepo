package com.onesoft.day6;

public class UseVoter {
public static void main(String[] args) {
	VoterAge v1=new VoterAge();
	v1.age=18;
	String findEgligble = v1.findEgligble();
	System.out.println(findEgligble);
	
	VoterAge v2=new VoterAge();
	v2.age=17;
	String findEgligble1 = v2.findEgligble();
	System.out.println(findEgligble1);}

}
