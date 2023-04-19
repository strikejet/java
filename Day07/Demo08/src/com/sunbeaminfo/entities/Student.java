package com.sunbeaminfo.entities;

import java.util.Scanner;

public class Student extends Person {
	private int rollno;
	private double percentage;
	
	public Student() {
		}

	public Student(int rollno, double percentage) {
		this.rollno = rollno;
		this.percentage = percentage;
	}
	
	public Student(String name, String address, int rollno, double percentage) {
		super(name,address);
		this.rollno = rollno;
		this.percentage = percentage;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public void acceptData() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rollno = ");
		this.rollno = sc.nextInt();

		System.out.print("Enter Percentage = ");
		this.percentage = sc.nextDouble();

		super.acceptData();
	}
	
	@Override
	public void displayData() {
		System.out.println("Rollno = "+this.rollno);
		System.out.println("Percentage = "+this.percentage+"%");
		super.displayData();
	}
	
	public void gracePercentage() {
		this.percentage = this.percentage + 2;
	}
	
}
