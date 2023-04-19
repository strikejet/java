package com.sunbeaminfo.tester;

import com.sunbeaminfo.entities.Employee;
import com.sunbeaminfo.entities.Person;
import com.sunbeaminfo.entities.Student;

public class Tester {

	public static void main(String[] args) {
	
		Person p1 = new Employee("e1","a1",1,1000); //upcasting
		//Person p1 = new Person("e1","a1");
		p1.displayData();
		
		Employee e1 = (Employee) p1; // Downcasting
		e1.incrementSalary();
		
		p1.displayData();
		
		
		p1 = new Student("s1","a2",1,38); // upcasting
		p1.displayData();
		
		Student s1 = (Student)p1; // Downcasting
		s1.gracePercentage();
		
		p1.displayData();
		
	}

}
