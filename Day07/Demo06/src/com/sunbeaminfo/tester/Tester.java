package com.sunbeaminfo.tester;

import com.sunbeaminfo.entities.Employee;
import com.sunbeaminfo.entities.Person;



public class Tester {

	public static void main(String[] args) {
	
		Person p1 = new Employee("e1","a1",1,1000); //upcasting
		Employee e1 = null;
		
		if(p1 instanceof Employee)
			 e1 = (Employee)p1; //downcasting
		else
			System.out.println("Downcasting is not possible");
	}

}
