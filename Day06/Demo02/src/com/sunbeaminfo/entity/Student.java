package com.sunbeaminfo.entity;

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
	
	
}
