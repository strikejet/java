package com.sunbeaminfo.entity;

public class Employee {
	int empid;
	String name;
	double salary;
	static int auto_increment_empid;

	static {
		auto_increment_empid = 0;
	}
	
	
	public Employee() {
	this.empid = ++auto_increment_empid;
	}
	
	public Employee(int empid, String name, double salary) {
		this.empid = ++auto_increment_empid;
		this.name = name;
		this.salary = salary;
	}
	
	public void displayEmployee() {
		System.out.println("Empid = "+this.empid);
		System.out.println("Name = "+this.name);
		System.out.println("Salary = "+this.salary);
	}
	
	public static void getEmployeeCount() {
		System.out.println("Employee Count = "+auto_increment_empid);
	}
	
	
	
	
	

}
