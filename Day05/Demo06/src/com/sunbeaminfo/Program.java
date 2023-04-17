package com.sunbeaminfo;

import java.util.Scanner;

class Employee {
	private int empid;
	private String name;
	private double salary;

	public Employee() {
		this(0, "", 0.0);
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
		System.out.println("Empid = " + this.empid);
		System.out.println("Name = " + this.name);
		System.out.println("Salary = " + this.salary);
	}

}

public class Program {

	public static void main(String[] args) {
		Employee[][] empArr = new Employee[2][];

		empArr[0] = new Employee[2];
		empArr[1] = new Employee[4];

		// creating the emp instance and accepting from user
		for (int row = 0; row < empArr.length; row++)
			for (int col = 0; col < empArr[row].length; col++) {
				empArr[row][col] = new Employee();
				empArr[row][col].acceptEmployee();
			}

		// display employees along with their department
		for (int row = 0; row < empArr.length; row++) {
			if (row == 0)
				System.out.println("Admin Department Employees -->");
			if (row == 1)
				System.out.println("Development Department Employees -->");
				for (int col = 0; col < empArr[row].length; col++)
					empArr[row][col].printEmployee();
		}
		
		//display all emps of organization using foreach
		System.out.println("Using for each loop");
		for(Employee emp[]:empArr)
			for(Employee employee:emp)
				employee.printEmployee();
		
		
		
		
		
		

	}
}
