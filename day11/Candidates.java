package com.onesoft.day11;

import java.util.HashMap;

public class Candidates {
	public static void main(String[] args) {
		HashMap<Integer,String > c=new HashMap<>();
		c.put(100, "Bala");
		c.put(101, "Godwin");
		c.put(102, "Sudhar");
		c.put(103,"Santhi");
		c.put(104, "Aditya");
		/*
		 * System.out.println("========Key and value========"); System.out.println(c);
		 * System.out.println("========get Only Keys ========");
		 * System.out.println(c.keySet());
		 * System.out.println("=======get Only values========");
		 * System.out.println(c.values());
		 * System.out.println("========get by Key console value========");
		 * System.out.println(c.get(103));
		 * System.out.println("========Remove the values by key========");
		 * System.out.println(c.remove(101)); System.out.println(c);
		 * 
		 * System.out.println("========enhanced for loop get only key========"); for
		 * (Integer s : c.keySet()) { System.out.println(s); }
		 * System.out.println("========enhanced for loop get only values========");
		 * 
		 * for (String g : c.values()) { System.out.println(g);
		 * 
		 * } System.out.
		 * println("========enhanced for loop get only values using the iterate the key ========"
		 * ); for (Integer s : c.keySet()) { System.out.println(c.get(s)); }
		 */
	System.out.println("======use the For each======get the values");
	c.forEach((k,v)->System.out.println(v));
	
	System.out.println("======use the For each======get the keys");
	c.forEach((k,v)->System.out.println(k));
	
	System.out.println("========Use the key to iterate get the values++++++++======");
	c.keySet().forEach((x)->System.out.println(c.get(x)));
	
	System.out.println("========Use  the values++++++++======");
	c.values().forEach((r)->System.out.println(r));
	
	}

}
