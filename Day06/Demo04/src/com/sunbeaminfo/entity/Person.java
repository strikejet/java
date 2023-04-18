package com.sunbeaminfo.entity;

public class Person {
	private String name;
	protected String address;
	int age;
	public int mobileno;
	
	public void displayPerson() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
		System.out.println(mobileno);
	}
}
