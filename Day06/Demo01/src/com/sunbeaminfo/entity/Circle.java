package com.sunbeaminfo.entity;

import java.util.Scanner;

public class Circle {
	private int radius;
	private final static double pi = 3.14;
	
	public void calcutateArea() {
		System.out.println("Enter the radius");
		this.radius = new Scanner(System.in).nextInt();
		System.out.println("Area of circle = "+(pi* this.radius*this.radius));
	}
}
