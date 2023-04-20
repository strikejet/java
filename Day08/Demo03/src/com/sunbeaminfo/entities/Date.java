package com.sunbeaminfo.entities;

import java.util.Scanner;

public class Date implements Serviceable{
	private int day;
	private int month;
	private int year;
	
	@Override
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day = ");
		this.day = sc.nextInt();
		
		System.out.print("Enter month = ");
		this.month = sc.nextInt();
		
		System.out.print("Enter Year= ");
		this.year = sc.nextInt();
	}
	
	@Override
	public void printData() {
		System.out.println("Date = "+this.day+"/"+this.month+"/"+this.year);
		
	}
	
	
	

}
