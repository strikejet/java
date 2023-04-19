package com.sunbeaminfo.tester;

import com.sunbeaminfo.entities.Employee;
import com.sunbeaminfo.entities.Person;
import com.sunbeaminfo.entities.Student;

public class Tester {

	public static void main(String[] args) {
	
		//Person p1 = new Person("p1","a1");
		//p1.displayData(); // Person class method
		
		Person p1 = new Employee("e1","a1",1,1000);
		p1.displayData(); // Dynamic Method Dispatch
		//p1.getName();
		//p1.getSalary(); // person class cannot call emp class methods
		
		p1 = new Student("s1","a1",1,70);
		p1.displayData(); // Dynamic Method Dispatch
		
	}

}
