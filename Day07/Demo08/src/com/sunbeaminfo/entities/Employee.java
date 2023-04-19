package com.sunbeaminfo.entities;

import java.util.Scanner;

public class Employee extends Person {
	private int empid;
	private double salary;

	public Employee() {
	}

	public Employee(int empid, double salary) {
		this.empid = empid;
		this.salary = salary;
	}

	public Employee(String name, String address, int empid, double salary) {
		super(name, address);
		this.empid = empid;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void acceptData() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Empid = ");
		this.empid = sc.nextInt();

		System.out.print("Enter Salary = ");
		this.salary = sc.nextDouble();

		super.acceptData();
	}

	@Override
	public void displayData() {
		System.out.println("Empid = " + this.empid);
		System.out.println("Salary = " + this.salary);
		super.displayData();
	}
	
	public void increment() {
		this.salary = this.salary + 0.1*this.salary;
	}

}