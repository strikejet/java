package com.sunbeaminfo.tester;

import com.sunbeaminfo.entities.Employee;
import com.sunbeaminfo.entities.Person;



public class Tester {

	public static void main(String[] args) {
	
		Person p1 = new Person("p1","a1");
		System.out.println(p1);
		
		p1 = new Employee("e1","a2",1,1000);
		System.out.println(p1);
	}

}
