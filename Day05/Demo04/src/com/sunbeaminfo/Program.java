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
		//reference type
		Employee [][] empArr = new Employee[3][2];
//		empArr[0][0] = new Employee();
//		empArr[0][0].acceptEmployee();
//		empArr[0][1] = new Employee();
//		empArr[0][1].acceptEmployee();
		
		//for loop to create the employee instance and accept the data
		for(int row = 0; row<empArr.length;row++) {
			for(int col = 0; col<empArr[row].length;col++) {
				empArr[row][col] = new Employee();
				empArr[row][col].acceptEmployee();
			}
		}
		
		
		//for loop to display all the employees from the array
		for(int row = 0;row<empArr.length;row++)
			for(int col = 0;col<empArr[row].length;col++)
				empArr[row][col].printEmployee();
		
		
		
		
	}
}
