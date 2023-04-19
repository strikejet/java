package com.sunbeaminfo.tester;

import com.sunbeaminfo.entity.Employee;

public class Tester {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "e1", 1000);
		//Employee e2 = e1;
		
		Employee e2 = new Employee(1, "e2", 1000);
		
		System.out.println(e1);
		System.out.println(e2);
		
		if(e1.equals(e2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

}
