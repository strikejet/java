package com.sunbeaminfo.tester;

import com.sunbeaminfo.entity.Person;

public class Tester {

	public static void main(String[] args) {
	
		Person p1 = new Person();
		p1.displayPerson();
	
		Person p2 = new Person("rohan","pune");
		p2.displayPerson();
		
		Person p3 = new Person("shubham","karad",1,1,2000);
		p3.displayPerson();
	
		Person p4 = new Person();
		p4.acceptPerson();
		p4.displayPerson();
	}

}
