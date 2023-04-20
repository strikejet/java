package com.sunbeaminfo.entities;

import java.util.Scanner;

public class Rectangle implements Shape{
	private int length;
	private int breadth;
	
	@Override
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length & breadth = ");
		this.length = sc.nextInt();
		this.breadth = sc.nextInt();
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Area of Rectangle = "+(this.length*this.breadth));
		
	}
}
