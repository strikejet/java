package com.sunbeaminfo.entity;

import java.util.Scanner;

import com.sunbeam.date.MyDate;

//dependent object
public class Person {
	private String name;
	private String address;
	//dependency object
	private MyDate dob;

	public Person() {
		this("", "", null);
	}

	public Person(String name, String address, MyDate dob) {
		this.name = name;
		this.address = address;
		this.dob = dob;
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

	public MyDate getDob() {
		return dob;
	}

	public void setDob(MyDate dob) {
		this.dob = dob;
	}

	public void acceptPerson() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter name = ");
		this.name = sc.next();

		System.out.print("Enter address = ");
		this.address = sc.next();

		if (this.dob != null) {
			System.out.println("Enter Birthdate below -");
			this.dob.acceptDate();
		}
	}

	public void displayPerson() {
		System.out.println("Name = " + this.name);
		System.out.println("Address = " + this.address);
		// System.out.println("BirthDate =
		// "+this.dob.getDay()+"/"+this.dob.getMonth()+"/"+this.dob.getYear());
		if (this.dob != null)
			this.dob.displayDate();
	}

}
