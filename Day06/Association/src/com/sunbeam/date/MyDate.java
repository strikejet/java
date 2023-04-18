package com.sunbeam.date;

import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate() {
	}

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void acceptDate() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter day = ");
		this.day = sc.nextInt();
		
		System.out.print("Enter month = ");
		this.month = sc.nextInt();
		
		System.out.print("Enter year = ");
		this.year = sc.nextInt();
	}
	
	public void displayDate() {
		System.out.println("Date = "+this.day+"/"+this.month+"/"+this.year);
	}
	
}
