package com.sunbeaminfo.entity;

import java.util.Scanner;

public class Person {
	private String name;
	private String address;
	
	public Person() {
		System.out.println("Inside Person Parameterless Ctor");
		this.name = "";
		this.address = "";
	}

	public Person(String name, String address) {
		System.out.println("Inside Person Parameterized Ctor");
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void acceptData() {
		Scanner sc = new Scanner( System.in);
		
		System.out.print("Enter name = ");
		this.name =  sc.next();
		
		System.out.print("Enter address = ");
		this.address =  sc.next();
	}
	
	public void displayData() {
		System.out.println("Name = "+this.name);
		System.out.println("Address = "+this.address);
	}
	
	
	
}
