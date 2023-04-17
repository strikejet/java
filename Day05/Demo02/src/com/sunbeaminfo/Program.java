package com.sunbeaminfo;

import java.util.Scanner;

class Employee{
	private int empid;
	private String name;
	private double salary;
	
	public Employee() {
		this(0,"",0.0);
	}
	
	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	void acceptEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter empid = ");
		this.empid = sc.nextInt();
		System.out.print("Enter Name = ");
		this.name = sc.next();
		System.out.print("Enter Salary = ");
		this.salary = sc.nextDouble();
	}
	
	void printEmployee() {
		System.out.println("Empid = "+this.empid);
		System.out.println("Name = "+this.name);
		System.out.println("Salary = "+this.salary);
	}
	
	
}

public class Program {

	public static void main(String[] args) {
	
		Employee [] empArr = new Employee[3];
		
		empArr[0] = new Employee(); // Parameterless Ctor
		
		empArr[1] = new Employee(1,"rohan",1000); // Parameterized ctor
		
		empArr[2] = new Employee();
		empArr[2].acceptEmployee();
		
		
		for (Employee employee : empArr)
			employee.printEmployee();
		
		
		
	}
}
