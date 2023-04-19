package com.sunbeaminfo.entities;

import java.util.Scanner;

public class Employee extends Person {
	private int empid;
	private double salary;

	public Employee() {
		System.out.println("Employee :: Parameterless Ctor");
	}

	public Employee(int empid, double salary) {
		System.out.println("Employee :: Parameterized Ctor");
		this.empid = empid;
		this.salary = salary;
	}
	
	public Employee(String name, String address, int empid, double salary) {
		super(name,address);
		System.out.println("Employee :: Parameterized Ctor - 2");
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

	public void acceptEmployee() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Empid = ");
		this.empid = sc.nextInt();

		System.out.print("Enter Salary = ");
		this.salary = sc.nextDouble();
	}

	public void displayEmployee() {
		System.out.println("Empid = "+this.empid);
		System.out.println("Salary = "+this.salary);
	}

}