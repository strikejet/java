package com.sunbeaminfo.entity;

import java.util.Scanner;

public class Student extends Person{
	
	private int rollno;
	private double percentage;
	
	public Student() {
		System.out.println("Inside Student Parameterless Ctor");	
	}

	public Student(int rollno, double percentage) {
		System.out.println("Inside Student Parameterized Ctor");
		this.rollno = rollno;
		this.percentage = percentage;
	}
	
	
	public Student(String name, String address, int rollno, double percentage) {
		super(name,address);
		System.out.println("Inside Student Parameterized - 2 Ctor");
		this.rollno = rollno;
		this.percentage = percentage;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Rollno = ");
		this.rollno = sc.nextInt();
		
		System.out.print("Percentage = ");
		this.percentage = sc.nextDouble();
	}
	
	public void displayData() {
		System.out.println("Rollno = "+this.rollno);
		System.out.println("Percentage = "+this.percentage);
		super.displayData();
	}
	
	
}
