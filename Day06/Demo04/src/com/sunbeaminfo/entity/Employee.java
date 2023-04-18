package com.sunbeaminfo.entity;

public class Employee extends Person {

	
	public void displayEmployee() {
		System.out.println(name);// not accessiable
		System.out.println(address);// accessiable
		System.out.println(age);// accessiable
		System.out.println(mobileno);// accessiable
	}
}
