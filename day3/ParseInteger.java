package com.onesoft.day3;

public class ParseInteger {
	public static void main(String[] args) {
		String upper = args[0].toUpperCase();
		System.out.println(upper);
		String word = args[8].substring(4);
		System.out.println(word);
		char last = args[0].charAt(args[0].length() - 1);
		System.out.println("Messi last letter is " + last);
		int jersyNo = Integer.parseInt(args[1]);
		System.out.println(jersyNo);
		float height = Float.parseFloat(args[2]);
		System.out.println(height);
		int goals = Integer.parseInt(args[3]);
		System.out.println(goals);
		boolean conditions = Boolean.parseBoolean(args[4]);
		System.out.println(conditions);
		long phNo = Long.parseLong(args[5]);
		System.out.println(phNo);
		boolean cond1 = Boolean.parseBoolean(args[6]);
		System.out.println(cond1);
		double avg = Double.parseDouble(args[7]);
		System.out.println(avg);

	}
}
