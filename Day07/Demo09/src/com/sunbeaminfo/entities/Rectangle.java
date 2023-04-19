package com.sunbeaminfo.entities;

import java.util.Scanner;

public class Rectangle extends Shape {
	private int length;
	private int breadth;
	
	
	@Override
	public void acceptData() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Length = ");
	this.length = sc.nextInt();
	
	System.out.print("Enter Breadth = ");
	this.breadth = sc.nextInt();
	}

	
	@Override
	public void calculateArea() {
		 this.setArea(this.length * this.breadth);
	}

}
