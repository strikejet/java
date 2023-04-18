package com.sunbeaminfo.entity;

public class Employee extends Person {
	private int empid;
	private double salary;
	
	public Employee() {
		System.out.println("Inside Employee Parameterless Ctor");
		}

	public Employee(int empid, double salary) {
		System.out.println("Inside Employee Parameterized Ctor");
		this.empid = empid;
		this.salary = salary;
	}
	
	public Employee(String name, String address, int empid, double salary) {
		super(name,address);
		System.out.println("Inside Employee Parameterized - 2  Ctor");
		this.empid = empid;
		this.salary = salary;
	}
	
	
}
