package com.onesoft.day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class UseEmployee {
public static void main(String[] args) {
	Employee e1 =new  Employee(1,"Raja",30,"Male",1200000,"Devops",9);
	Employee e2 =new  Employee(2,"Adtiya",24,"Male",1200000,"Developer",8);
	Employee e3 =new  Employee(3,"Mala",28,"Female",620000,"Tester",6);
	Employee e4 =new  Employee(4,"Rajii",21,"Female",1700000,"Manager",13);
	Employee e5 =new  Employee(5,"Sudhar",29,"Male",1200000,"Back Office",4);
	Employee e6 =new  Employee(6,"Selvi",28,"Female",120000,"System.Admin",6);
	Employee e7 =new  Employee(7,"Ganesh",28,"Male",620000,"QA Manager",6);
	
	HashMap<Integer, Employee> employees=new HashMap<>();
	employees.put(e1.getId(), e1);
	employees.put(e2.getId(), e2);
	employees.put(e3.getId(), e3);
	employees.put(e4.getId(), e4);
	employees.put(e5.getId(), e5);
	employees.put(e6.getId(), e6);
	employees.put(e7.getId(), e7);
/*	System.out.println("=========Use  the Enhanced For loop=========");
	for (Integer s : employees.keySet()) {
		System.out.println(employees.get(s));
	}
	System.out.println("=========Use theEnhanced only key=========");
	for (Integer s : employees.keySet()) {
		System.out.println(s);
	}
	System.out.println("=========Use theEnhanced only key1=========");
	for (Integer s : employees.keySet()) {
		if (employees.get(s).getGender().equalsIgnoreCase("Female")) {
			System.out.println(employees.get(s));
		}
	}
	
	
	System.out.println("=========Use the enhanced loop get values =========");
	for (Employee  s : employees.values()) {
		System.out.println(s);
	}
	
	System.out.println("=========Use the filter to use conditions=========");
	employees.keySet().forEach((k)-> System.out.println(employees.get(k)));
	
	System.out.println("=========Using forEach Loop values=======");
	employees.values().forEach((k)-> System.out.println(k));
	
	System.out.println("=========Use the filter to use conditions for Female=========");
	
	employees.values().forEach((v)-> {
		if(v.getGender().equalsIgnoreCase("Female")) {
			System.out.println(v);
		}
	});
	System.out.println("=========Use the filter to use conditions for salary more than 800000=========");
	employees.values().forEach((v)-> {
		if(v.getSalary()>800000) {
			System.out.println(v);
		}
	});
	System.out.println("=========Use the filter to use conditions for Male=========");
	employees.values().forEach((v)-> {
		if(v.getGender().equalsIgnoreCase("Male")) {
			System.out.println(v);
		}
	});
	System.out.println("=========Use the filter to use conditions for NoOf Year >=9 =========");
	employees.values().forEach((v)-> {
		if(v.getNoOfYearExp()>=9) {
			System.out.println(v);
		}
	});
	
	
	System.out.println("=========Use the filter to use conditions for Female=========");

	employees.keySet().forEach((s)->{
	if (employees.get(s).getGender().equalsIgnoreCase("Female")) {
		System.out.println(employees.get(s));
	}
	
	});
	
	
	
	System.out.println("+++++++++++ new HashMap+++++++");
	HashMap<Integer,Employee> male=new HashMap<>();
	employees.values().forEach((v)-> {
		if(v.getGender().equalsIgnoreCase("Male")) {
			if(v.getNoOfYearExp()>6) {
		male.put(v.getId(), v);
		}
			
			}
		
	});
	//System.out.println(male);
	  System.out.println("+++++++++++new HashMap for Male use for Enhanced loop++++++++++++++");
		for (Employee e : male.values()) {
			System.out.println(e);
			
		}
	
	 System.out.println("+++++++++++new HashMap for Female++++++++++++++");
	  HashMap<Integer,Employee> female=new HashMap<>();
	  employees.keySet().forEach((v)-> {
	  if(employees.get(v).getGender().equalsIgnoreCase("Female")) {
	  female.put(v,employees.get(v) ); }
	 
	  });
	  
	  System.out.println("+++++++++++new HashMap for Female use for Enhanced loop++++++++++++++");
	for (Employee e : female.values()) {
		System.out.println(e);
		
	}
		*/
/*	//HashMap<Integer,Employee> exp8=new HashMap<>();
employees.values().forEach((v)-> {
		
			if(v.getNoOfYearExp()>6) {
employees.remove(v.getId()
		);
		}
			
	});
	System.out.println(employees);
	 */
	/*
	Iterator<Employee>x=employees.values().iterator();
	while (x.hasNext()) {
		if(x.next().getNoOfYearExp()<8) {
			x.remove();
		}
	}
	
	employees.values().forEach((y)-> System.out.println(y));*/
	
	/*
	 * System.out.println("++++++++++++Use enhanced for loop get both key and Value"
	 * );
	 * 
	 * for (Integer s : employees.keySet()) {
	 * System.out.println(s+" "+employees.get(s)); }
	 * 
	 * System.out.
	 * println("++++++++++++Use Iterator  remove the more than 800000+++++++++++++" ); 
	 * Iterator<Employee>x=employees.values().iterator(); while (x.hasNext()) {
	 * if(x.next().getSalary()<800000) {
	 *  x.remove(); 
	 *  } }
	 * employees.values().forEach((y)-> System.out.println(y));
	
	
	
	//employees.forEach((k,v)-> System.out.println(v+" "+k));
	long max=e1.getSalary();
	for (Integer s : employees.keySet()) {
	
		if (employees.get(s).getSalary()>max) {
			max=employees.get(s).getSalary();
			
		}
	}
	System.out.println(max);
	 */
	
	employees.forEach((k,v)-> System.out.println(k+":::"+v));
	
	/* System.out.println("+++++++++++new HashMap for Female++++++++++++++");
	  HashMap<Integer,Employee> female=new HashMap<>();
	  employees.keySet().forEach(v-> {
	  if(employees.get(v).getGender().equalsIgnoreCase("Female")) {
	  female.put(v,employees.get(v) ); }
	 
	  });*/
}
}
