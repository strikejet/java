package com.sunbeaminfo.tester;

import com.sunbeaminfo.entity.Employee;
import com.sunbeaminfo.entity.Person;
import com.sunbeaminfo.entity.Student;

public class Tester {

	public static void main(String[] args) {
		
		Person p1 = new Person("rohan","pune");
		p1.displayData();
		
		//Employee e1 = new Employee(1,1000);
		//e1.displayData();
	
		//Employee e2 = new Employee("rohan","pune",1,1000);
		//e2.displayData();
		
		//Student s1 = new Student(1,70);
		//s1.displayData();
		
		Student s2 = new Student("pratik","karad",2,80);
		s2.displayData();
		
		
		
	}

}
