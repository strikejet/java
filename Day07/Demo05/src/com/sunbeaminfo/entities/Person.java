package com.sunbeaminfo.entities;

import java.util.Scanner;

public class Person {
	private String name;
	private String address;
	
	public Person() {
	}

	public Person(String name, String address) {
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
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name = ");
		this.name = sc.next();
		
		System.out.print("Enter Address = ");
		this.address = sc.next();
	}
	
	public void displayData() {
		System.out.println("Name = "+this.name);
		System.out.println("Address = "+this.address);
	}
	
}
