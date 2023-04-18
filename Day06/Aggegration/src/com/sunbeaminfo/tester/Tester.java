package com.sunbeaminfo.tester;

import com.sunbeam.date.MyDate;
import com.sunbeaminfo.entity.Person;

public class Tester {

	public static void main(String[] args) {
	
		Person p1 = new Person();
		p1.displayPerson();
	
		
		MyDate d1 = new MyDate();
		Person p2 = new Person("rohan","pune",d1);
		p2.displayPerson();
	
		p1.setDob(d1);
		p1.displayPerson();
		
	}

}
