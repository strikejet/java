package com.sunbeaminfo.tester;

import com.sunbeaminfo.entity.Person;

public class Student extends Person{

	public void displayStudent() {
		System.out.println(mobileno); // accessiable
		System.out.println(address); //accessiable
		System.out.println(age); //not accessiable
		System.out.println(name);//mot accessiable
	}
}
